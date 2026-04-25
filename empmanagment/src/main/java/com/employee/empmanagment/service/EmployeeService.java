package com.employee.empmanagment.service;

import java.util.List;

import com.employee.empmanagment.model.Employee;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(Long Id);
    List<Employee>getAllEmployees();
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
    

}
