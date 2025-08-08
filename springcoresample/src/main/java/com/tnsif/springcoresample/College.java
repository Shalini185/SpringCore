package com.tnsif.springcoresample;

public class College {
	private Student student;
	public void setStudent(Student student) {
		this.student=student;
	}

	public College() {
		System.out.println("Colllege object created....");
		// TODO Auto-generated constructor stub
	}
	public void show() {
		System.out.println("Welcome to college ");
		student.display();
	}
	

}
