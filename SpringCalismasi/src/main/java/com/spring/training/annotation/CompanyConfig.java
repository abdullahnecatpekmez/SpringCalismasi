package com.spring.training.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompanyConfig {
	@Bean
	public Address customerAddress()
	{
		Address  adr=new Address();
		adr.setStreet("Customer Address");
		return adr;
	}
	@Bean
	public Address companyAddress()
	{
		Address  adr=new Address();
		adr.setStreet("Company Address");
		return adr;
	}
	@Bean
	public Customer customer()
	{
		Customer customer=new Customer();
		customer.setAddress(customerAddress());
		customer.setName("abdullah");
		return customer;
	}
	@Bean
	public Company company()
	{
		Company company=new Company();
		company.setAddress(companyAddress());
		company.setCustomer(customer());
		company.setName("Youtube sag olsun :)");
		return company;
	}

}
