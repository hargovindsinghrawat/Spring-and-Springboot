package com.learnnew.springprac.examples.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessCalculationServiceLauncherApplication {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(BusinessCalculationServiceLauncherApplication.class)){
			
			System.out.println(
					context.getBean(BusinessCalculationService.class).findMax());
		}	
	}
}