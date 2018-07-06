package com.servdemo.org.controller;

import java.io.IOException;



import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;


import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.servdemo.org.pojo.Student;
import com.servdemo.org.repo.StandardRepo;
import com.servdemo.org.repo.StudentRepo;
import com.servdemo.org.repo.SubjectRepo;
import com.servdemo.org.repo.addressrepo;






@Controller
public class controller  {
  
@Autowired
StudentRepo studentrepo;
@Autowired
addressrepo addressrepo; 
@Autowired
StandardRepo standardrepo ;
@Autowired
SubjectRepo subjectrepo;
@Autowired 
	
	 
	    @RequestMapping(value="/home",method = RequestMethod.GET)  
	    public String viewRegistration(Map<String, Object> model) {
	       Student userForm = new Student();    
	        model.put("student_register", userForm);
	        
	               
	        return "home";
	    }

	    
	    @RequestMapping(method = RequestMethod.POST)
	    public String processRegistration(@ModelAttribute("userForm") Student student,
	            Map<String, Object> model) {
	         
	     
	    	studentrepo.save(student);
	         
	        return "RegistrationSuccess";
	    }
}


  