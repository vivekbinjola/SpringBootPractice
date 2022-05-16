package com.vivek.maven.springCore.medicines;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("com/vivek/maven/springCore/medicines/Listconfig.xml");
		Prescription obj = (Prescription) context.getBean("pres");
//		System.out.println(obj.getId());
//		System.out.println(obj.getPatientName());
		System.out.println(obj);
 
	}

}
