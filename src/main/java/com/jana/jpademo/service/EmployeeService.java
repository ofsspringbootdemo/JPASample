package com.jana.jpademo.service;

import com.jana.jpademo.model.Employee;
import com.jana.jpademo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

  @Autowired
  EmployeeRepository repository;

  public void saveOrUpdate(Employee employee) {
    repository.save(employee);
  }

  public Optional<Employee> getEmployeeById(Long id) {
    return repository.findById(id);
  }

  public List<Employee> getAllEmployee() {
    return repository.findAll();
  }

  public List<Employee> getEmployeeByLastName(String lastName) {
    return repository.getByLastName(lastName);
  }

  public void deleteEmployee(Long id) {
    repository.deleteById(id);
  }
}
