package com.servdemo.org.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Subject {
	
	int id;
	String subject;
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	

	
	 
	 
	public Subject(String subject, Student student) {
//		super();
		this.subject = subject;
		this.student = student;
	}





	private Student student;
	
	
	
	 @ManyToOne
	 @JoinColumn(name = "student_subject_id")
	public Student getStudent() {
		return student;
	}
	public Subject(String string) {
		
		
		this.subject = string;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	

}
