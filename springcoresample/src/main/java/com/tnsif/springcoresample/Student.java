package com.tnsif.springcoresample;

public class Student {
	private String name;
	//private int age;



	public void setName(String name) {
		this.name = name;
	}



	public Student() {
		//super();
		// TODO Auto-generated constructor stub
		System.out.println("Student object is created...");
	}
	public void display() {
		System.out.println("STudent name : " + name);
	}
	
	

}
