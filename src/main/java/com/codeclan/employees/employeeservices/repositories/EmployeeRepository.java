package com.codeclan.employees.employeeservices.repositories;

import com.codeclan.employees.employeeservices.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
