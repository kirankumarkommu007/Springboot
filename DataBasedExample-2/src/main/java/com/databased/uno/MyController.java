package com.databased.uno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	private UserRepo a;
	
	@GetMapping("/orders")
	public List<Customers> getData(){
		return a.findAll();
	}
}
