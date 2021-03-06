package tespapp.controllers;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;
import org.springframework.stereotype.Component;

import tespapp.entities.Employee;
import tespapp.services.DepartmentRepository;
import tespapp.services.EmployeeRepository;

@Component
public class EmployeesMgr implements Runnable {

	private final LocalDate startDate = LocalDate.of(2022, 1, 1);
	private final LocalDate endDate = LocalDate.of(2022, 12, 31);

	private final EmployeeRepository employeeRepository;
	private final DepartmentRepository departmentRepository;

	public EmployeesMgr(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
		this.employeeRepository = employeeRepository;
		this.departmentRepository = departmentRepository;
	}

	@Override
	public void run() {
		LocalDate currentDate = startDate;

		Random random = new Random();
		int counter = 0;

		while(currentDate.compareTo(endDate) != 1) {
			//hiring process
			Employee employee = new Employee(employeeRepository.getByRandomDate(currentDate),
						departmentRepository.findById(random.nextLong(9) + 1).get().getID());
			employee.setEmployeeDepartmentName(departmentRepository.findById(employee.getDepartmentId()).get().getDepartmentName());
			employeeRepository.save(employee);

			System.out.println("Current date: " + currentDate + ". Employee ID: " + employee.getID() + ", Hire Date: " + employee.getHireDate()
							+ ", Department name: " + employee.getEmployeeDepartmentName());
			counter += 1;
			currentDate = currentDate.plusDays(1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			

			//fired process
			if(counter % 5 == 0) {
				int numberOfFiredEmployees = random.nextInt(3) + 1;
				long numberOfEmployee = employeeRepository.count();
				for(int i = 1; i <=numberOfFiredEmployees; i++) {
					long randomId = random.nextLong(numberOfEmployee) + 1;
					employeeRepository.setEmployeeFiredById(randomId,
							employeeRepository.getByRandomDate(currentDate));
				}
			}
		}
	}
}
