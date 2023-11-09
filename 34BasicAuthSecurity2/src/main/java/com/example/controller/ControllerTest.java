package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.EmployeService;

@Controller
public class ControllerTest {

	@Autowired
	private EmployeService employeService;
	
	
	
	@GetMapping("/home")
	@ResponseBody
	public String hello() {
		return "Home";
	}
	@GetMapping("/loggg")
	public String hello1() {
		return "Log";
	}
	@GetMapping("/login")
	@ResponseBody
	public String hello13() {
		return "qwertyu";
	}
	@GetMapping("/page")
	public String hello2() {
		return "Welcome";
	}
	
}
