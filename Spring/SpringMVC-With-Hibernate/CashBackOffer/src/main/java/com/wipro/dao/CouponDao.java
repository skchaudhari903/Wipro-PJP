package com.wipro.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.wipro.bean.Coupon;

public class CouponDao {

	JdbcTemplate template;

	public Coupon getCouponById(String couponcode) {
		String sql = "select * from Coupon where couponcode=?";
		return template.queryForObject(sql, new Object[] { couponcode },
				new BeanPropertyRowMapper<Coupon>(Coupon.class));
	}
}
