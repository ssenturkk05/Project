package com.example.project.service;

import com.example.project.entities.Employee;
import com.example.project.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
private EmployeeRepository employeeRepository;

public List<Employee> getAllEmployees() {
    return employeeRepository.findAll();
}

public Optional<Employee> getEmployeeById(Long id) {
    return employeeRepository.findById(id);
}

public Employee createEmployee(Employee employee) {
    return employeeRepository.save(employee);
}

public Employee updateEmployee(Long id, Employee employeeDetails) {
    Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

    employee.setName(employeeDetails.getName());
    employee.setSurname(employeeDetails.getSurname());
    employee.setLevel(employeeDetails.getLevel());
    employee.setPhoneNumber(employeeDetails.getPhoneNumber());
    employee.setEmail(employeeDetails.getEmail());
    employee.setBirthDate(employeeDetails.getBirthDate());
    employee.setWorkType(employeeDetails.getWorkType());
    employee.setContractType(employeeDetails.getContractType());
    employee.setAffiliatedTeam(employeeDetails.getAffiliatedTeam());
    employee.setStartDateOfWork(employeeDetails.getStartDateOfWork());
    employee.setContractEndDate(employeeDetails.getContractEndDate());
    employee.setProject(employeeDetails.getProject());

    return employeeRepository.save(employee);
}

public void deleteEmployee(Long id) {
    Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    employeeRepository.delete(employee);
}
}