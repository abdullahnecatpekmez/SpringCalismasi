package com.spring.training.annotation2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MyApplication {

	public static void main(String[] args) {
		/*//farkli config context arama
		  AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		  context.scan("com.spring.training.annotation2");
		  context.refresh();
		*/
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CompanyConfig.class);
		Company company=(Company) context.getBean("company",Company.class);
		System.out.println("company name: "+company.getName());
		System.out.println("Company Address:  "+company.getAddress().getStreet());
		System.out.println("Company Customer Name:  "+company.getCustomer().getName());
		System.out.println("Company Customer Address: "+company.getCustomer().getCustomerAddress().getStreet());

	}

}
