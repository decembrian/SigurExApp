package tespapp.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tespapp.entities.Department;

@Repository("departmentRepository")
public interface DepartmentRepository extends JpaRepository<Department, Long>{
}
