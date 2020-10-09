package com.abhishek.springboot;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
@Validated
public class login {
	@NotEmpty(message = "Please enter A Name")
	private String name;
	@NotEmpty(message = "Please enter A Password")
	@NotNull
	private String pass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}



}
