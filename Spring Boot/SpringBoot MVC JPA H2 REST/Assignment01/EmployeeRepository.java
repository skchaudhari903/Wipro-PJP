package com.abhishek.repository;
import org.springframework.data.repository.CrudRepository;
import com.abhishek.model.Employee;
public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
}
