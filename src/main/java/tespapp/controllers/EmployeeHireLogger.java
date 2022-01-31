/*package tespapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import tespapp.entities.Employee;

@Component
public class EmployeeHireLogger implements Runnable{
	
	private final EmployeesMgr employeesMgr;
	
	public EmployeeHireLogger(EmployeesMgr employeesMgr) {
		this.employeesMgr = employeesMgr;
	}

	@Override
	public void run() {
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		employeesMgr.getListOfEmployee(listOfEmployee);
		
		System.out.println(listOfEmployee.size());
	}
}*/
