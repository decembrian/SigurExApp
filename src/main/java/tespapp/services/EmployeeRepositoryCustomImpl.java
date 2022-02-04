package tespapp.services;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Optional;
import java.util.Random;

import org.springframework.context.annotation.Lazy;
import tespapp.entities.Employee;

public class EmployeeRepositoryCustomImpl implements EmployeeRepositoryCustom{

    private final EmployeeRepository employeeRepository;

    Random random = new Random();
	LocalDate endDate = LocalDate.of(2022, 12, 31);

	public EmployeeRepositoryCustomImpl(@Lazy EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public LocalDate getByRandomDate(LocalDate hireDate) {
		if(Math.random() < 0.5){
			long days = ChronoUnit.DAYS.between(hireDate, endDate);
			long rndDate = random.nextLong(days) + 1;
			return hireDate.plusDays(rndDate);
		}else return hireDate;
	}

	@Override
	public void setEmployeeFiredById(long id, LocalDate fired_time) {
		Optional<Employee> employee = employeeRepository.findById(id);
		employee.ifPresent(e -> e.setFiredDate(fired_time));
		employeeRepository.save(Employee.class.cast(employee));
	}
}
