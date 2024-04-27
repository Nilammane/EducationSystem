package com.EducationSystem.DAO;

import java.util.List;

import com.google.gson.Gson;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class educationdaoimpl implements educationdao {

	@Override
	public String addStudentDetails() {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("tcc");
			emf.createEntityManager().createQuery("");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}

	@Override
	public String coursedetailjs() {
		 System.out.println("in course dao");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tcc");
	    List<Object> list = emf.createEntityManager().createQuery("FROM courses").getResultList();
	   
	    Gson gson = new Gson();
		return gson.toJson(list);
	}

	

}
