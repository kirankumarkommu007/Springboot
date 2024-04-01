package com.data.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Demo implements Demoser {
	
	@Autowired
	private UserRepository b;

	@Override
	public List<Friends> getData() {
		return b.findAll();
	}

}
