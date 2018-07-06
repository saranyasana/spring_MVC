package com.servdemo.org.util;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servdemo.org.pojo.Address;
import com.servdemo.org.pojo.Board;
import com.servdemo.org.pojo.Standard;
import com.servdemo.org.pojo.Student;
import com.servdemo.org.pojo.Teacher;
import com.servdemo.org.repo.StandardRepo;
import com.servdemo.org.repo.StudentRepo;
import com.servdemo.org.repo.Teacherrepo;
import com.servdemo.org.repo.addressrepo;

@RestController
public class tempController {

	@Autowired
	addressrepo addressrepo; 
	@Autowired
	StandardRepo standardrepo ;
	@Autowired
	StudentRepo studentrepo;
	@Autowired 
   Teacherrepo teacherrepo;

	@SuppressWarnings("serial")
	@RequestMapping("/")
	public String temp_insert() {
		
/*
		Student student=new Student("Sam","Disilva","A",new Board("CBSE"),new Address("10 Silver street","Maharashtra","India"),new Standard("10"));

		HashSet<Subject> subAs = new HashSet<Subject>(){{
			add(new Subject("Maths",student));
		}};



		student.setSubject(subAs);


		studentrepo.save(new HashSet<Student>() {{
			add(student);

		}});



		studentrepo.save(student);

	

		
		return studentrepo.findAll().toString();*/
		//return "done";
		
		
		
		 Student student = new Student("Sam","Disilva","A",new Board("CBSE"),new Address("10 Silver street","Maharashtra","India"),new Standard("10"));
//	        Student publisherB = new Student("Student B");
//	        Student publisherC = new Student("Student C");

	       teacherrepo.save(new HashSet<Teacher>(){{
	    	                           
	            add(new Teacher("Suman","Banerjee","10","M.Tech", new HashSet<Student>(){{
	                add(student);          //add(publisherB);
	            }}));
//
//	            add(new Teacher("Teacher B", new HashSet<Student>(){{
//	                add(publisherA);
//	               // add(publisherC);
//	            }}));
	        }});

	        // fetch all books
	      
	        // save a couple of publishers
	      //  Teacher teacher = new Teacher("Suman","Banerjee","10","M.Tech");
	       // Teacher bookB = new Teacher("Teacher B");

//	       studentrepo.save(new HashSet<Student>() {{
//	            add(new Student("Sam", new HashSet<Teacher>() {{
//	                add(teacher);
//	               // add(bookB);
//	            }}));

//	            add(new Student("Student B", new HashSet<Teacher>() {{
//	                add(bookA);
//	            //    add(bookB);
//	            }}));
//	        }});
//
//	        // fetch all publishers
	     
	   
	
		return studentrepo.findAll().toString();

	}

}
