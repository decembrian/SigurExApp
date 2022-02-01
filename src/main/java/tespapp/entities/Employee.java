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
@Table(name = "employees")
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
		if(firedDate != null) {
			return Objects.hash(ID, hireDate, firedDate, departmentId);
		}else return Objects.hash(ID, hireDate, departmentId);
	}
}
