package com.hargovind.learnspringaop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {

	@Pointcut("execution(* com.hargovind.learnspringaop.aopexample.*.*.*(..))")
	public void BusinessAndDataPackageConfig() {
		
	}
}
