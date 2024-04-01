package com.data.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Autowired
	public Demoser k;
	
	@GetMapping("/users")
	public List<Friends> getData(){
		return k.getData();
	}
}
