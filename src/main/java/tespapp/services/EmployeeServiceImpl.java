package tespapp.services;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import tespapp.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private final EmployeeRepositoryBasic employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepositoryBasic employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
	
	Random random = new Random();
	
	/*@Override
	public Optional<Employee> findByRandomId(long id) {
		long numberOfEmployee = employeeRepository.count();
		return employeeRepository.findById(random.nextLong(numberOfEmployee) + 1);
	}*/

	@Override
	public void setEmployeeFiredById(long id, LocalDate fired_time) {
		Optional<Employee> employee = employeeRepository.findById(id);
		employee.get().setFIRED_TIME(fired_time);
		employeeRepository.save(Employee.class.cast(employee));
	}
}
