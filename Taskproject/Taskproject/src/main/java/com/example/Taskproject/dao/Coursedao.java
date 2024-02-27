package com.example.Taskproject.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Taskproject.dto.Coursedto;
import com.example.Taskproject.repo.Courserepose;

@Component
public class Coursedao {
	
	@Autowired
	Courserepose courserepose;
	
	public String insertcourse(Coursedto coursedto) {
		courserepose.save(coursedto);
		return "inseted";
	}
	
	public Coursedto fetchcourse(String coursename) {
		Optional<Coursedto> co=courserepose.findById(coursename);
		return co.get();
		
	}

}
