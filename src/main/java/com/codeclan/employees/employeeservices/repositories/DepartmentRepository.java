package com.codeclan.employees.employeeservices.repositories;

import com.codeclan.employees.employeeservices.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
