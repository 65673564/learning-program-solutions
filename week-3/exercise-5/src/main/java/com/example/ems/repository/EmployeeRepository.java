package com.example.ems.repository;

import com.example.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Derived query methods
    List<Employee> findByName(String name);
    List<Employee> findByRoleContaining(String keyword);

    // Custom query using JPQL
    @Query("SELECT e FROM Employee e WHERE e.department.name = ?1")
    List<Employee> findByDepartmentName(String departmentName);
}
