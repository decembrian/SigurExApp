package tespapp.controllers;

import org.springframework.stereotype.Component;

@Component
public class EmployeeHireLogger implements Runnable{
	
	private final EmployeesMgr employeesMgr;
	
	public EmployeeHireLogger(EmployeesMgr employeesMgr) {
		this.employeesMgr = employeesMgr;
	}

	@Override
	public void run() {


	}
}
