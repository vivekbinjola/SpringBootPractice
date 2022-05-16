package com.vivek.maven.springCore.InnerBeans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
	 
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/vivek/maven/springCore/InnerBeans/config.xml");
	Employee emp = (Employee) ctx.getBean("employee");
	System.out.println( emp  );
 
	}
}
