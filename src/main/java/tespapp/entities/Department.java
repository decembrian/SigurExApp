package tespapp.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name =  "departments")
public class Department implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", length =  32)
	private String departmentName;

	public Department() {
	}
	
	public Department(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public Long getID() {
		return id;
	}
	public String getDepartmentName() {
		return this.departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.departmentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(this.departmentName, other.departmentName);
	}

	@Override
	public String toString() {
		return "Department [Name=" + departmentName + "]";
	}
}
