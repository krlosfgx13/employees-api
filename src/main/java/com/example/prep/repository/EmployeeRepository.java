package com.example.prep.repository;

import com.example.prep.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value="SELECT * FROM employee WHERE last_name = ?1 AND first_name = ?2 ORDER BY id ASC LIMIT 1", nativeQuery = true)
    //@Query("FROM Employee WHERE lastName = ?1 AND firstName = ?2")
    Employee findEmployeeByName(String lastName, String firstName);

    @Query("FROM Employee WHERE country = ?1")
    List<Employee> findEmployeesByCountry(String country);

    @Query(value = "SELECT * FROM employee WHERE salary between ?1 AND ?2", nativeQuery = true)
    List<Employee> findEmployeesBySalaryRange(float startSalary, float endSalary);
}

