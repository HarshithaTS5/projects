package com.example.Taskproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Taskproject.dao.Studentdao;
import com.example.Taskproject.dto.Studentdto;

@Service
public class Studentservice {
	
	@Autowired
	Studentdao studentdao;

	public String insertstudent(Studentdto dto) {
		
		// TODO Auto-generated method stub
		return  studentdao.insertstudent(dto);
	}
    
	     public Studentdto fetchstudentById(int id) {
		 Optional<Studentdto> od=studentdao.fetchstudentById(id);
		 if(od.isPresent()) {
			 return od.get();
		 }
		 else {
			 return null;
		 }
	}
	 
	 
	     public List<Studentdto>fetchAllstudent(){
		 List<Studentdto>list=studentdao.fetchAllstudent();
		 if(list.isEmpty()) {
			 return null;
		 }
		 else
			 return list;
		 
		 }
	 }



