package Test.Example.Unit.Testing.Springboot.repository;

import Test.Example.Unit.Testing.Springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
