package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
	ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
	Student student = (Student) con.getBean("ob");
	System.out.println(student);
	System.out.println(student.getAddress());
	System.out.println();
	
	System.out.println(student.hashCode());
	
	Student std= (Student) con.getBean("ob");
    System.out.println(std.hashCode());
	}

}
