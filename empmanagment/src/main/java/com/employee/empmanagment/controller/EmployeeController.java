package com.employee.empmanagment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.empmanagment.model.Employee;
import com.employee.empmanagment.service.EmployeeService;

@RestController // tells spring this is rest api contoller
@RequestMapping("/api/employees")//base url for all APIs
public class EmployeeController {
@Autowired //injexts the EmployeeService
    private EmployeeService service; 

    @PostMapping //maps to http post(used to create data)
    //RequestBody reads JSON from request and maps to Java object
    public Employee create(@RequestBody Employee employee){
        return service.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee>getAll(){
        return service.getAllEmployees();
    }

@GetMapping("/{id}")
    public Employee getById(@PathVariable Long id){
        return service.getEmployeeById(id);
    }

@PutMapping("/{id}") //maps to HTTP PUT(update data)
    public Employee update(@PathVariable Long id, @RequestBody Employee employee){
        return service.updateEmployee(id, employee);
    
    }
//PathVariable extracts value from the URL path(eg: /api/employee/1)
    public String delete(@PathVariable Long id){
        service.deleteEmployee(id);
        return "Employee deleted successfully.";
    }


}
