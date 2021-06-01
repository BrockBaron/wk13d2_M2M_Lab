package com.codeclan.employees.employeeservices;

import com.codeclan.employees.employeeservices.models.Department;
import com.codeclan.employees.employeeservices.models.Employee;
import com.codeclan.employees.employeeservices.models.Project;
import com.codeclan.employees.employeeservices.repositories.DepartmentRepository;
import com.codeclan.employees.employeeservices.repositories.EmployeeRepository;
import com.codeclan.employees.employeeservices.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeservicesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;


	@Test
	public void contextLoads() {
	}

	@Test
	public void canAddEmployeeAndDepartment() {
		Department department = new Department("R&D");
		departmentRepository.save(department);

		Employee employee = new Employee("Nick", "Lekkas", 234, department);
		employeeRepository.save(employee);
	}

//	@Test
//	public void canAddEmployeeAndProject() {
//		Project project = new Project("Trojan Horse");
//		projectRepository.save(project);
//
//		Employee employee = new Employee("Nick", "Lekkas", 234);
//		employeeRepository.save(employee);
//	}
}
