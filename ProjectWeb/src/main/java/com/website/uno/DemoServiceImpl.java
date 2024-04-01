package com.website.uno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private UserRepo j;

	@Override
	public List<Employees> getdata() {
		return  j.findAll();
	}

}
