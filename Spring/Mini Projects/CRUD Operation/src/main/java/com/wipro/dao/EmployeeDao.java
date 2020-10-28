package com.wipro.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.wipro.bean.Employee;

public class EmployeeDao {
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int save(Employee p) {
		String sql = "insert into Employee(id,name,designation,salary) values("+p.getId()+",'"+p.getName()+"','"+p.getDesignation()+"',"+p.getSalary()+")";
		return template.update(sql);
	}
	
	public int update(Employee p){  
	    String sql="update Employee set name='"+p.getName()+"',designation='"+p.getDesignation()+"',salary="+p.getSalary()+" where id="+p.getId()+"";  
	    return template.update(sql);
	}
	
	public int delete(int id){  
	    String sql="delete from Employee where id="+id+"";  
	    return template.update(sql);  
	}
	
	public Employee getEmpById(int id){  
	    String sql="select * from Employee where id=?";  
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Employee>(Employee.class));  
	}
	
	public List<Employee> getEmployees(){  
	    return template.query("select * from Employee",new RowMapper<Employee>(){  
	        public Employee mapRow(ResultSet rs, int row) throws SQLException {  
	        	Employee e = new Employee();  
	            e.setId(rs.getInt(1));  
	            e.setName(rs.getString(2));  
	            e.setDesignation(rs.getString(3));
	            e.setSalary(rs.getInt(4));
	            return e;  
	        }  
	    });
	}
}
