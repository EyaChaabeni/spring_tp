package net.javaguides.springbootservice;
import java.util.List;
import net.javaguides.springbootmodel.Employee;


public interface EmployeeService {
Employee saveEmployee(Employee employee);
List<Employee> getAllEmployees();
Employee getEmployeeById(long id);
Employee updateEmployee(Employee employee, long id);
void deleteEmployee(long id);
}


