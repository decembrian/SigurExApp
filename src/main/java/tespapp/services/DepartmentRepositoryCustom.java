package tespapp.services;

import tespapp.entities.Department;

public interface DepartmentRepositoryCustom {
    Iterable<Department> findAll();
}
