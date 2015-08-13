package com.spring.traning.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;






public class MyApplication {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
		Company company=(Company) context.getBean("company",Company.class);
		System.out.println("company name: "+company.getName());
		System.out.println("Company Address:  "+company.getAddress().getStreet());
		System.out.println("Company Customer Name:  "+company.getCustomer().getName());
		System.out.println("Company Customer Address: "+company.getCustomer().getAddress().getStreet());
	}

}

