package com.hargovind.learnspringaop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Before("com.hargovind.learnspringaop.aopexample.aspects.CommonPointcutConfig.BusinessAndDataPackageConfig()")
	public void logMethodCallBefore(JoinPoint joinPoint) {
		logger.info("Before Aspect - Method is called - {} is called with arguments: {}", joinPoint , joinPoint.getArgs());
	}
	
	@After("com.hargovind.learnspringaop.aopexample.aspects.CommonPointcutConfig.BusinessAndDataPackageConfig()")
	public void logMethodCallAfter(JoinPoint joinPoint) {
		logger.info("After Aspect - {} has executed", joinPoint);
	}
	
	@AfterThrowing(pointcut = "com.hargovind.learnspringaop.aopexample.aspects.CommonPointcutConfig.BusinessAndDataPackageConfig()",
					throwing = "exception")
	public void logMethodCallAfterThrowing(JoinPoint joinPoint, Exception exception) {
		logger.info("AfterThrowing Aspect - {} has thrown an exception {}", joinPoint, exception);
	}
	
	@AfterReturning(pointcut = "com.hargovind.learnspringaop.aopexample.aspects.CommonPointcutConfig.BusinessAndDataPackageConfig()",
					returning = "resultValue")
	public void logMethodCallAfterReturning(JoinPoint joinPoint, Object resultValue) {
		logger.info("AfterReturning Aspect - {} has returned {}", joinPoint, resultValue);
	}
}
