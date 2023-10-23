package net.javaguides.springbootrepository;
import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.springbootmodel.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}




