package com.example.Taskproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Taskproject.dto.Coursedto;
import com.example.Taskproject.dto.Studentdto;
import com.example.Taskproject.service.Courseservice;
import com.example.Taskproject.service.Studentservice;

@Controller
public class Studentcontroller {
	
	@Autowired
	Studentservice studentservice;
	
	@Autowired
	Courseservice courseservice;
	
	@RequestMapping("/shtml")
	public String stdhtml() {
		return "student";
	}

	@PostMapping("/si")
	@ResponseBody
	public String insertStudent(@ModelAttribute Studentdto dto) {
		System.out.println(dto);
		String cn=dto.getCoursename();
		Coursedto coursedto=courseservice.fetchcourse(cn);
		dto.setCoursedto(coursedto);
		System.out.println(dto);
		return studentservice.insertstudent(dto);
		}
       
	    @GetMapping("/fsid")
	    public String fetchstudentById(@RequestParam int id,ModelMap map) {
		Studentdto studentdto=studentservice.fetchstudentById(id);
		map.put("object", studentdto);
		return "fetchById.html";
	}
	
	     @GetMapping("/fetchallstudent")
	     public String fetchAllstudent(ModelMap map) {
		 List<Studentdto> list=studentservice.fetchAllstudent();
		 map.put("objects", list);
		 return "fetchall.html";
	 }
	
	}

