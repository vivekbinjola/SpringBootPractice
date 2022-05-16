package com.vivek.maven.springCore.map;
 

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class mapTest {
	
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    String userInput = sc.next();
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/vivek/maven/springCore/map/Mapconfig.xml");

    CurrencyConverter obj = (CurrencyConverter) context.getBean("currencyconvert");
//    System.out.println(obj.getTotalCurrencyValue(userInput))
//    System.out.println(obj.getmObj());
    
    obj.getTotalCurrencyValue(userInput);
    
	context.close();
	sc.close();
}

}
