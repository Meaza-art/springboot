package com.banking_app.banking_app.controler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.banking_app.banking_app.model.Employee;
import com.banking_app.banking_app.repo.employeeRepo;
import com.banking_app.banking_app.service.EmployeeService;
import java.util.List;

@RestController
// following the local host url
@RequestMapping ("/api/v1/employee")
public class employeeControler
{
    @Autowired
    private  EmployeeService employeeService;


@GetMapping
public List<Employee> getAllEmployees(){

    return employeeService.getAllEmployees();
}



    // Get an employee by ID
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    // Create a new employee
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    // Update an existing employee
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
        return employeeService.updateEmployee(id, employeeDetails);
    }

    // Delete an employee
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}
