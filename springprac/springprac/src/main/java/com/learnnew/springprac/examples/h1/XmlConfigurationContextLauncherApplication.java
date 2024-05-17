package com.learnnew.springprac.examples.h1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learnnew.springprac.game.GameRunner;

@Configuration
@ComponentScan
public class XmlConfigurationContextLauncherApplication {

	public static void main(String[] args) {
		
		try(var context = 
				new ClassPathXmlApplicationContext
					("contextConfiguration.xml")){
			
			//List of all beans which are part of this spring context
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println);
			
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			context.getBean(GameRunner.class).run();
		}	
	}
}