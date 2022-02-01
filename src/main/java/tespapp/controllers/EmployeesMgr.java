package tespapp.controllers;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import tespapp.entities.Department;
import tespapp.entities.Employee;
import tespapp.services.DepartmentRepository;
import tespapp.services.EmployeeRepository;

@Component
public class EmployeesMgr implements Runnable{
	
	private final LocalDate startDate = LocalDate.of(2022, 1, 1);
	private final LocalDate endDate = LocalDate.of(2022, 12, 31);
	//private final int numberOfDepartment = 10;
	
	private final EmployeeRepository employeeRepository;
	private final DepartmentRepository departmentRepository;
	
	public EmployeesMgr(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
		super();
		this.employeeRepository = employeeRepository;
		this.departmentRepository = departmentRepository;
	}

	@Override
	public void run() {
		/*for(int i = 1; i <= numberOfDepartment; i++) {
			departmentRepository.save(new Department(Integer.toString(i)));
		}
		
		Random random = new Random();
		int counter = 0;
		LocalDate currentDate = startDate;
		
		while(currentDate.compareTo(endDate) != 1) {
			//hiring process
			Employee employee = new Employee();
			employee.setHireDate(currentDate);
			employee.setDepartmentId((departmentRepository.findById(random.nextLong(9) + 1)).get().getID());
			employeeRepository.save(employee);
			
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
					employeeRepository.setEmployeeFiredById(randomId, currentDate);
				}
			}
		}*/

        Employee employee = new Employee(startDate, endDate, 2);
        employeeRepository.save(employee);
	}
	
	/*public List<Employee> getListOfEmployee(List<Employee> listOfEmployee){
		listOfEmployee = employeeRepository.findAll();
		return listOfEmployee;
	}*/
}
