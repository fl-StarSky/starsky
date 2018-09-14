
package com.example.srpingBoot;

import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class HttpAspect {
	private static final Logger logger = LoggerFactory.getLogger(HttpAspect.class);
	
	@Pointcut("execution(public * com.example.srpingBoot.controller.UserController.register(..))")
	public void log(){
		
	}
	
	@Before("log()")
	public void beforeLog(JoinPoint joinPoint) {
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		
		logger.info("url={}",request.getRequestURI());
		logger.info("method = {}",request.getMethod());
		logger.info("clientIp={}",request.getRemoteHost());
		logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
		logger.info("param={}",joinPoint.getArgs());
	}
	
	@AfterReturning(returning="object",pointcut="log()")
	public void afterReturningLog(Object object){
		logger.info("response={}",object);
	}
}
