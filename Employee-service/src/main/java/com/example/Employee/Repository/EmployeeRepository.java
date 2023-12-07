package com.example.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Employee.Model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	
	@Query(value="Select*from microdb.employee e where e.employee_id=:employeeId", nativeQuery=true)
	Employee findByEmployeeId(Long employeeId);
	
	
}
