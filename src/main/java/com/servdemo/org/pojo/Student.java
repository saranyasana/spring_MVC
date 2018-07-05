package com.servdemo.org.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {



	private long id;


	private String firstName;


	private String lastName;


	private String section;


  
    
    private Board board;
    
    private Set<Subject> subject;
    
    
    public Student(String firstName, String lastName, String section, Board board, Set<Subject> subject,
			 Standard standard) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
		this.board = board;
		this.subject = subject;
	
		this.standard = standard;
	}
    

	public Student(String firstName, String lastName, String section, Board board, Set<Subject> subject2,
			Address address, Standard standard) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
		this.board = board;
		this.subject = subject2;
		this.address = address;
		this.standard = standard;
	}


	@OneToMany(mappedBy = "subject",cascade = CascadeType.ALL)
    public Set<Subject> getSubject() {
		return subject;
	}

	public void setSubject(Set<Subject> subject) {
		this.subject = subject;
	}

	
	

	


	public Student() {
		
	}

	private Address address;
	private Standard standard;


	public Student(String firstName, String lastName, String section, Board board, Address address,
			Standard standard) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
	
		this.board = board;
		this.address = address;
		this.standard = standard;
	}

	public Student(String firstName, String lastName, String section) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
	}
	
	public Student(String firstName, String lastName, String section, Address address) {
		
	//	super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
		this.address = address;
	}

	

	public Student( String firstName, String lastName, String section, Board board) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
		this.board = board;
	}

	public Student(String firstName, String lastName, String section, Board board, Address address) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.section = section;
		
		this.board = board;
		this.address = address;
	}

	


	public Student(String string, String string2, String string3, Board board2, Subject subject2, Address address2,
			Standard standard2) {
		// TODO Auto-generated constructor stub
	}


	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_address_id")
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", section=" + section
				+ ", board=" + board + ", subject=" + subject + ", address=" + address + ", standard=" + standard + "]";
	}


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_board_id")
	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
    
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_standard_id")
	public Standard getStandard() {
		return standard;
	}

	public void setStandard(Standard standard) {
		this.standard = standard;
	}

	
}
