package tespapp.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;

	@Column(name = "hire_date")
	private LocalDate hireDate;

	@Column(name = "fired_date")
	private LocalDate firedDate;

	@Column(name = "department_id")
	private long departmentId;

	private String employeeDepartmentName;

	public Employee() {

	}

	public Employee(LocalDate hireDate, long departmentId) {
		this.hireDate = hireDate;
		this.departmentId = departmentId;
	}

	public long getID() {
		return ID;
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

	public String getEmployeeDepartmentName() {
		return employeeDepartmentName;
	}

	public void setEmployeeDepartmentName(String employeeDepartmentName) {
		this.employeeDepartmentName = employeeDepartmentName;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"ID=" + ID +
				", hireDate=" + hireDate +
				", firedDate=" + firedDate +
				", departmentId=" + departmentId +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return ID == employee.ID && departmentId == employee.departmentId && Objects.equals(hireDate, employee.hireDate) && Objects.equals(firedDate, employee.firedDate);
	}

	@Override
	public int hashCode() {
		if(firedDate == null){
			return Objects.hash(ID, hireDate, departmentId);
		}else return Objects.hash(ID, hireDate, firedDate, departmentId);
	}
}
