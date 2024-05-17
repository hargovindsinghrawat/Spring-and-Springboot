package com.hargovind.learnspringaop.aopexample.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Configuration
@Aspect
public class PerformanceTrackingAspect {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Around("com.hargovind.learnspringaop.aopexample.aspects.CommonPointcutConfig.BusinessAndDataPackageConfig()")
	public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long startTimeMills = System.currentTimeMillis();
		
		Object returnValue = proceedingJoinPoint.proceed();
		
		long stopTimeMills = System.currentTimeMillis();
		
		long executionDuration = stopTimeMills - startTimeMills;
		
		logger.info("Around Aspect - {} Method executed in {}", proceedingJoinPoint, executionDuration);
		
		return returnValue;
	}
}
