package com.tnsif.springcoreexample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //detects the object
public class College {
	private Student student;
   @Autowired //creates object
	public College(Student student) {
		//super();
		this.student = student;
	}
   public void showCollegeDetails() {
	   System.out.println("Welcome the the college...");
	   student.showStudent();
   }
	
}
