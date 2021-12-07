package com.nt.ojas.SpringMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.oja.Employee;

public class App {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e = (Employee) ctx.getBean("emp1");
		System.out.println(e.toString());

	}

}
