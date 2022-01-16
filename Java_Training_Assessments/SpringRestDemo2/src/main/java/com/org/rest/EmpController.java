package com.org.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.restpost.PostData;
import com.org.restpost.PostDataResponse;

@RestController
public class EmpController {

	@RequestMapping("/empinfo")
	public Employee Emp(@RequestParam(value="empname")String empname)
{
		Employee e1= new Employee();
		e1.setId(101);
		e1.setEmpname("Hello "+ empname);
		e1.setAddress("belgavi");
		
		return e1;
		}
	
	@RequestMapping(value="/postdata", method=RequestMethod.POST)
	public PostDataResponse Test(@RequestBody PostData p ) {
		PostDataResponse p1 = new PostDataResponse();
		p1.setName("Hello" + p.getName());
		p1.setPhoneNo(p.getPhoneNo());
		p1.setProject("Working on ");
		
		return p1;
		
	}
}
