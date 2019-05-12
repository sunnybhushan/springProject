package com.jspider.aspect;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class aspecto 
	{
	
Logger log = Logger.getLogger(aspecto.class);
	
	@Pointcut("within(com.jspiders.app.controller..*) ")
	void withinMyChoice() {
		
		
	}

	@Around("withinMyChoice()")
	public Object Advice(ProceedingJoinPoint join) throws Throwable {
	  Signature signature = join.getSignature();
		String name = signature.getName();
		String args = Arrays.toString(join.getArgs());
		Object proceed = join.proceed();
		
		log.fatal("sunny");
		log.error("message");
		log.warn("sunny");
		log.info("message");
		log.debug("sunny");
		log.trace("message");


		 log.info(signature+" args ->"+args+" result-> "+proceed );
		System.out.println(signature + " args ->" + args + " result->" + proceed);
		return proceed;
	}
}
