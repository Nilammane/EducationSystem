package com.EducationSystem.Controller;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.NumberUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.EducationSystem.DTO.CourseStudentDetails;
import com.EducationSystem.Service.EducationService;
import com.EducationSystem.Service.EducationServiceimpl;

import io.micrometer.common.util.StringUtils;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class EducationController {
    private EducationService educationservice;
	@Autowired
	public EducationController(EducationService educationservice) {
		super();
		this.educationservice = educationservice;
	}
   /*
	@Autowired
	EducationService educationservice;*/
	@RequestMapping("/index")
	public String index() {
		System.out.println("educationcontroller");
		return "index";
	}
	
	@RequestMapping(value = "/coursedetail", method=RequestMethod.POST)
	public String requestMethodName(HttpServletRequest req) {
		CourseStudentDetails courseStudentDetails = new CourseStudentDetails();
		courseStudentDetails.setStud_name(req.getParameter("stud_name"));
		courseStudentDetails.setStud_phone(Integer.parseInt(req.getParameter("stud_phone")));
		courseStudentDetails.setStud_email(req.getParameter("stud_email"));
		courseStudentDetails.setStud_course(req.getParameter("courseselection"));
		return educationservice.addStudentDetails(courseStudentDetails);
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/course-details")
	public String coursedetails() {
		return "course-details";
	}
	
	@RequestMapping("/event-details")
	public String eventdetails() {
		return "event-details";
	}
	
	@RequestMapping("/elements")
	public String element() {
		return "elements";
	}
	
	@RequestMapping(value = "/coursedetailsjs")
	@ResponseBody
	public String coursedetailjs() {
		return educationservice.coursedetailjs();
		
	}
}
