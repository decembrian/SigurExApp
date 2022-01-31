package tespapp.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Departments")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	private String Name;
	
	public Department() {
	}
	
	public Department(String name) {
		Name = name;
	}
	
	public Long getID() {
		return ID;
	}
	public String getNAME() {
		return Name;
	}
	public void setNAME(String name) {
		Name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Name);
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
		return Objects.equals(Name, other.Name);
	}

	@Override
	public String toString() {
		return "Department [Name=" + Name + "]";
	}
}
