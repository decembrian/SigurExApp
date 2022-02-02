package tespapp.services;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import tespapp.entities.Employee;

import java.time.LocalDate;
import java.util.Optional;

public interface EmployeeRepositoryCustom {

    Optional<Employee> findByRandomId(long id);



    @Transactional
    @Modifying
    @Query("update Employee e set e.firedDate = :FIRED_TIME where e.ID = :ID")
    void setEmployeeFiredById(@Param(value = "ID") long id, @Param(value = "FIRED_TIME") LocalDate fired_time);
}
