package com.abhishek.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.abhishek.model.Employee;
import com.abhishek.service.EmployeeService;
@RestController
public class EmployeeController
{
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employee")
    private List<Employee> getAllEmployee()
    {
        return employeeService.getAllEmployee();
    }
    @GetMapping("/employee/{empid}")
    private Employee getEmployee(@PathVariable("bookid") int bookid)
    {
        return employeeService.getEmployeeById(bookid);
    }
    @DeleteMapping("/employee/{empid}")
    private void deleteEmployee(@PathVariable("bookid") int bookid)
    {
        employeeService.delete(bookid);
    }
    @PostMapping("/employee")
    private int saveEmployee(@RequestBody Employee employee)
    {
        employeeService.saveOrUpdate(employee);
        return employee.getempid();
    }
    @PutMapping("/employee")
    private Employee update(@RequestBody Employee employee)
    {
        employeeService.saveOrUpdate(employee);
        return employee;
    }
}
