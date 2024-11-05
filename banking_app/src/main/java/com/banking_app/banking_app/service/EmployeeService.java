package com.banking_app.banking_app.service;
import com.banking_app.banking_app.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.banking_app.banking_app.repo.employeeRepo;
@Service
public class EmployeeService {
    @Autowired
    private employeeRepo EmployeeRepo;
    public List<Employee> getAllEmployees() {
        return EmployeeRepo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return EmployeeRepo.findById(id).orElse(null);
    }

    public Employee createEmployee(Employee employee) {
        return EmployeeRepo.save(employee);
    }

    public Employee updateEmployee(Long id, Employee employeeDetails) {
        Employee employee = getEmployeeById(id);
        if (employee != null) {
            employee.setFirstName(employeeDetails.getFirstName());
            employee.setLastName(employeeDetails.getLastName());
            employee.setEmail(employeeDetails.getEmail());
            return EmployeeRepo.save(employee);
        }
        return null;
    }

    public void deleteEmployee(Long id) {
       EmployeeRepo.deleteById(id);
    }
}
