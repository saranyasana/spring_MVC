package com.servdemo.org.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servdemo.org.pojo.Address;
import com.servdemo.org.pojo.Board;
import com.servdemo.org.pojo.Standard;
import com.servdemo.org.pojo.Student;
import com.servdemo.org.pojo.Subject;
import com.servdemo.org.repo.StandardRepo;

import com.servdemo.org.repo.StudentRepo;
import com.servdemo.org.repo.addressrepo;

@RestController
public class tempController {

	@Autowired
	addressrepo addressrepo; 
	@Autowired
	StandardRepo standardrepo ;
	
	@Autowired
	StudentRepo studentrepo;
	
	

	
	@SuppressWarnings("serial")
	@RequestMapping("/")
	public String temp_insert() {
		
	
		

		  @SuppressWarnings("serial")
			HashSet<Subject> subAs = new HashSet<Subject>(){{
	            add(new Subject("Maths"));
	          
	        }};
       
	Student students=new Student("Sam","Disilva","Maths",new Board("CBSE"),new Subject("Maths"),new Address("10 Silver street","Maharashtra","India"),new Standard("10"));
//		students.add(new Student("Sara","Sego","History",new Board("ICSE"),new Address("10 Wakad street","Maharashtra","India")));
//		
//		students.add(new Student("Priyanka","ass","Maths",new Board("CBSE"),new Address("10 Wakad street","Maharashtra","India")));
		
		//students.add(new Student("Sam","Disilva","Maths",new Area("Wakad")));
		
		//students.add(new Student("Sam","Disilva","Maths",));
		
		
	
      
//        students.setSubject(subAs);
//
//        
//        studentrepo.save(new HashSet<Student>() {{
//            add(students);
//           
//        }});
//		
		studentrepo.save(students);
		
	//	return studentrepo.findAll().toString();
		return "done";
	}
	
	}
