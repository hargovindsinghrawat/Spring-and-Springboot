package com.learnnew.springprac;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.learnnew.springprac.game.GameRunner;

@Configuration
@ComponentScan("com.learnnew.springprac.game")
public class GamingAppLauncherApplication {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(GamingAppLauncherApplication.class)){
			
			context.getBean(GameRunner.class).run();
		}
		
	}

}
