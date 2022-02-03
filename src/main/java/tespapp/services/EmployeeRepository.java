
package tespapp.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tespapp.entities.Employee;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;


@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

    default LocalDate getByRandomDate(LocalDate hireDate) {
        Random random = new Random();
        LocalDate endDate = LocalDate.of(2022, 12, 31);
        if(Math.random() < 0.5){
            long days = ChronoUnit.DAYS.between(hireDate, endDate);
            long rndDate = random.nextLong(days) + 1;
            return hireDate.plusDays(rndDate);
        }else return hireDate;
    }
}

