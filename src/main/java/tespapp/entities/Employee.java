package tespapp.entities;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;

	@Column(name = "hire_date")
	private LocalDate hireDate;

	@Column(name = "fired_date")
	private LocalDate firedDate;

	@Column(name = "department_id")
	private long departmentId;

	public Employee() {

	}

	public Employee(LocalDate hireDate, LocalDate firedDate, long departmentId) {
		this.hireDate = hireDate;
		this.firedDate = firedDate;
		this.departmentId = departmentId;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public LocalDate getFiredDate() {
		return firedDate;
	}

	public void setFiredDate(LocalDate firedDate) {
		this.firedDate = firedDate;
	}

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}


}
