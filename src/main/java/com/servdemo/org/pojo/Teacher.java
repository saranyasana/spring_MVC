package com.servdemo.org.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	
	public Teacher( String firstName, String lastName, String qualification, String experience) {
		
		
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Qualification = qualification;
		this.Experience = experience;
		
		
	}
	
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", Qualification=" + Qualification + ", Experience=" + Experience + "]";
	}
	@Column(name = "FirstName")
	private String FirstName;
	
	@Column(name = "LastName")
	private String LastName;
	
	@Column(name = "Qualification")
	private String Qualification;
	
	@Column(name = "Experience")
	private String Experience;
	
	
public Long getid() {
	return id;
}
public void setid(Long id) {
	this.id = id;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getQualification() {
	return Qualification;
}
public void setQualification(String qualification) {
	Qualification = qualification;
}
public String getExperience() {
	return Experience;
}
public void setExperience(String experience) {
	Experience = experience;
}
}
