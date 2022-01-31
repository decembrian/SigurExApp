package tespapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tespapp.controllers.EmployeeHireLogger;
import tespapp.controllers.EmployeesMgr;


@SpringBootApplication
public class SigurExAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(SigurExAppApplication.class, args);
	}
}
