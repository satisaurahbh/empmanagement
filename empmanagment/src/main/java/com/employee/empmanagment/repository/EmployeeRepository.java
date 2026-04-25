package com.employee.empmanagment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.empmanagment.model.Employee;
//Repository layes talks with db
//Repository provides all basic CRUD operation automa--
// Don't need to write sql to intrect with db
//here JpaRepo using for Employee entity whose primary key is type of Long
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
