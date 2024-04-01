package com.website.uno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

 @Autowired
 private DemoService s;
 
  
  @GetMapping("/users")
  public List<Employees> getData(){
	  return s.getdata();
  }
	
	
}
