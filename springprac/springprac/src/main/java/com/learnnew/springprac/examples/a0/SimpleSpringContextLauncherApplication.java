package com.learnnew.springprac.examples.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(SimpleSpringContextLauncherApplication.class)){
			
			//List of all beans which are part of this spring context
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}	
	}
}