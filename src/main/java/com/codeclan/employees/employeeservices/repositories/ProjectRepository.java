package com.codeclan.employees.employeeservices.repositories;

import com.codeclan.employees.employeeservices.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
