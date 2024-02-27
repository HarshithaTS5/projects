package com.example.Taskproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Taskproject.dto.Coursedto;
import com.example.Taskproject.service.Courseservice;

@Controller
public class Coursecontroller {
	
	@Autowired
	Courseservice courseservice;
	
	@RequestMapping("/chtml")
	public String courseHtml() {
		return "course";
		
	}

	@PostMapping("/cl")
	@ResponseBody
	public String insertcourse(@ModelAttribute Coursedto coursedto) {
		//System.out.pritln(coursedto);
		return courseservice.insertcourse(coursedto);
		
	}
}