package com.EducationSystem.Service;

import org.springframework.stereotype.Service;

import com.EducationSystem.DAO.educationdao;
import com.EducationSystem.DAO.educationdaoimpl;
import com.EducationSystem.DTO.CourseStudentDetails;


@Service
public class EducationServiceimpl implements EducationService {
    private educationdao educationdao= new educationdaoimpl();
	@Override
	public String addStudentDetails(CourseStudentDetails courseStudentDetails) {
		return educationdao.addStudentDetails();
	}

	@Override
	public String coursedetailjs() {
		return educationdao.coursedetailjs();
	}
	
	

}
