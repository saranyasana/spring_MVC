package com.servdemo.org.util;

<<<<<<< HEAD
import java.util.HashSet;
=======
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
>>>>>>> ee2a7a299e2e7975db90bae5d903efea74bfcb0e

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servdemo.org.pojo.Address;
import com.servdemo.org.pojo.Board;
import com.servdemo.org.pojo.Standard;
import com.servdemo.org.pojo.Student;
<<<<<<< HEAD
import com.servdemo.org.pojo.Teacher;
import com.servdemo.org.repo.StandardRepo;
import com.servdemo.org.repo.StudentRepo;
import com.servdemo.org.repo.Teacherrepo;
=======
import com.servdemo.org.pojo.Subject;
import com.servdemo.org.repo.StandardRepo;

import com.servdemo.org.repo.StudentRepo;
>>>>>>> ee2a7a299e2e7975db90bae5d903efea74bfcb0e
import com.servdemo.org.repo.addressrepo;

@RestController
public class tempController {

	@Autowired
	addressrepo addressrepo; 
	@Autowired
	StandardRepo standardrepo ;
<<<<<<< HEAD

	@Autowired
	StudentRepo studentrepo;

	@Autowired 
   Teacherrepo teacherrepo;


=======
	
	@Autowired
	StudentRepo studentrepo;
	
	

	
>>>>>>> ee2a7a299e2e7975db90bae5d903efea74bfcb0e
	@SuppressWarnings("serial")
	@RequestMapping("/")
	public String temp_insert() {
		
<<<<<<< HEAD
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
=======
	
		

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
>>>>>>> ee2a7a299e2e7975db90bae5d903efea74bfcb0e
