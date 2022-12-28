package com.ASSR.let.sdoit.bussiness;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BussinessConfiguration {
public static void main(String[] args) {
	try(var context=new AnnotationConfigApplicationContext
			(BussinessConfiguration.class)){
	
	System.out.println(context.getBean(BussinessCalculationService.class).findMax());
	System.out.println(context.getBean(BussinessCalculationService.class).information());
	System.out.println(context.getBeanDefinitionNames());
	}}
}
