package com.vivek.maven.springCore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("com/vivek/maven/springCore/list/Listconfig.xml");
		Hospital obj = (Hospital) context.getBean("Hospital");
		System.out.println(obj.getName());
		System.out.println(obj.getDepartments().getClass());
	}

}
