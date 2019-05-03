package com.jana.jpademo.repository;

import com.jana.jpademo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

  List<Employee> getByLastName(String lastName);
}
