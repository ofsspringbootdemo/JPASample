package com.jana.jpademo.controller;

import com.jana.jpademo.model.Employee;
import com.jana.jpademo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

  @Autowired
  EmployeeService service;

  @PostMapping
  public void addOrUpdateEmployee(@RequestBody Employee employee) {
    service.saveOrUpdate(employee);
  }

  @GetMapping
  public List<Employee> getEmployee() {
    return service.getAllEmployee();
  }

  @GetMapping("/{id}")
  public Optional<Employee> getEmployeeById(@PathVariable Long id) {
    return service.getEmployeeById(id);
  }

  @GetMapping("/lastName/{lastName}")
  public List<Employee> getEmployeeByLastName(@PathVariable String lastName) {
    return service.getEmployeeByLastName(lastName);
  }

  @DeleteMapping("/{id}")
  public void deleteEmployee(@PathVariable Long id) {
    service.deleteEmployee(id);
  }
}
