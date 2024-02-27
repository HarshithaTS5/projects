package com.example.Taskproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Taskproject.dto.Studentdto;

@Repository
public interface Studentrepose  extends JpaRepository<Studentdto,Integer>{

}
