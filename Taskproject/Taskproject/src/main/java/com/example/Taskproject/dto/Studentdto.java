package com.example.Taskproject.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="studentdetails")
public class Studentdto {
	
	@Id
	private int studentid;
	@Column(nullable=false)
	private String studentname;
	@Column(nullable=false)
	private String studentemail;
	private String coursename; 
	
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	@OneToOne
	private Coursedto coursedto;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentemail() {
		return studentemail;
	}
	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}
	public Coursedto getCoursedto() {
		return coursedto;
	}
	public void setCoursedto(Coursedto coursedto) {
		this.coursedto = coursedto;
	}
	@Override
	public String toString() {
		return "Studentdto [studentid=" + studentid + ", studentname=" + studentname + ", studentemail=" + studentemail
				+ ", coursename=" + coursename + ", coursedto=" + coursedto + "]";
	}
	
	
	
	

}
