package com.wipro.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.wipro.bean.Customer;

public class CustomerDao {

	JdbcTemplate template;

	public Customer getCustomerById(String customerid) {
		String sql = "select * from Customer where customerid=?";
		return template.queryForObject(sql, new Object[] { customerid },
				new BeanPropertyRowMapper<Customer>(Customer.class));
	}
}