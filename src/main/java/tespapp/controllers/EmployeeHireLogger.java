package tespapp.controllers;

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
		/*for(int i = 1; i <= 10; i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
	}
}
