package com.abhishek.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abhishek.model.Employee;
import com.abhishek.repository.EmployeeRepository;
@Service
public class EmployeeService
{
    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployee()
    {
        List<Employee> books = new ArrayList<Employee>();
        employeeRepository.findAll().forEach(employee1 -> books.add(employee1));
        return books;
    }
    public Employee getEmployeeById(int id)
    {
        return employeeRepository.findById(id).get();
    }
    public void saveOrUpdate(Employee employee)
    {
        employeeRepository.save(employee);
    }
    public void delete(int id)
    {
        employeeRepository.deleteById(id);
    }
    public void update(Employee employee, int bookid)
    {
        employeeRepository.save(employee);
    }
}
