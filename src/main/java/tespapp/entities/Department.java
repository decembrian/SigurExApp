package tespapp.entities;

import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name =  "departments")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", length =  32)
	private String name;
	
	public Department() {
	}
	
	public Department(String name) {
		this.name = name;
	}
	
	public Long getID() {
		return id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.name);
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
		return Objects.equals(this.name, other.name);
	}

	@Override
	public String toString() {
		return "Department [Name=" + name + "]";
	}
}
