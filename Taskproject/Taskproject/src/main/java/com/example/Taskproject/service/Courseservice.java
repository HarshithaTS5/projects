package com.example.Taskproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Taskproject.dao.Coursedao;
import com.example.Taskproject.dto.Coursedto;

@Service
public class Courseservice {
	
	@Autowired
	Coursedao coursedao;
	
	public String insertcourse(Coursedto coursedto) {
		
		return coursedao.insertcourse(coursedto);
	}
	
	public Coursedto fetchcourse(String coursename) {
		return coursedao.fetchcourse(coursename);
	}
//	public String insertCourse(Coursedto coursedto) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
