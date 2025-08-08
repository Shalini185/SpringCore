package com.tnsif.springcoreexample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
   // System.out.println("Hello World!");
	  
	  //loads the config file
   ApplicationContext context=new ClassPathXmlApplicationContext("ConfigurationContext.xml");
   
   //getBean
   College college=context.getBean("college", College.class);
   college.showCollegeDetails();
  }
}
