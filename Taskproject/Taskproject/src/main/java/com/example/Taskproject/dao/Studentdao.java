package com.example.Taskproject.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Taskproject.dto.Studentdto;
import com.example.Taskproject.repo.Studentrepose;
@Component
public class Studentdao {
	@Autowired
	Studentrepose studentrepose;
	
	public String insertstudent(Studentdto dto) {
		studentrepose.save(dto);
		return "data inserted";
		
	}
	 public Optional<Studentdto> fetchstudentById(int id){
		 return studentrepose.findById(id);
	 }

	   public List<Studentdto>fetchAllstudent(){
		   List<Studentdto>list=studentrepose.findAll();
		   return list;
	   }
}
