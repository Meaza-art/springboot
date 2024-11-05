package com.banking_app.banking_app.repo;

import com.banking_app.banking_app.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepo extends JpaRepository<Employee, Long> {

}
