package tespapp.services;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public interface EmployeeService {
	/*Optional<Employee> findByRandomId(long id);*/
	
	@Transactional
	@Modifying
	@Query("update Employee e set e.FIRED_TIME = :FIRED_TIME where e.ID = :ID")
	void setEmployeeFiredById(@Param(value = "ID") long id, @Param(value = "FIRED_TIME") LocalDate fired_time);
}