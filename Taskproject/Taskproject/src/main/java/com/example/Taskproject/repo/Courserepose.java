package com.example.Taskproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Taskproject.dto.Coursedto;

@Repository
public interface Courserepose  extends JpaRepository<Coursedto, String>{

}
