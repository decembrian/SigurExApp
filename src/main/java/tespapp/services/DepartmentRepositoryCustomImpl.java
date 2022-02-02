package tespapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tespapp.entities.Department;

@Transactional
@Service("departmentService")
public class DepartmentRepositoryCustomImpl implements DepartmentRepositoryCustom{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Iterable<Department> findAll() {
        return departmentRepository.findAll();
    }
}
