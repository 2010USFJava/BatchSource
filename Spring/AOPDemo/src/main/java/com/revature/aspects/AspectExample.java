package com.revature.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class AspectExample {
	/*
	 *  In Hibernate, we implemented JPA rather than Hibernate specific annotations. 
	 *  
	 *  In Spring AOP, we implement aspectj. It simplifies aspects BUT it does reduce the 
	 *  configurability as a result. 
	 *  (Spring AOP abstracts aspectj from us)
	 *  
	 *  What is an aspect?
	 *  	An aspect is a modularization of cross cutting concerns. 
	 *  	Inside Java, it takes the form of a class. You can ALSO think of an aspect as a 
	 *  collection of advice. 
	 *  
	 *  
	 */
	/*
	 * What is an advice?
	 * 		An advice is an action taken by an aspect. In Spring AOP advice is triggered by method invocations. 
	 * 		In Java, an advice takes the form of a method itself. 
	 * 
	 * Types of advice:
	 * 		@Before
	 * 		@After
	 * 		@AfterReturning
	 * 		@AfterThrowing
	 * 		@Around 
	 * 
	 * JoinPoints are the possible points in the runtime of the program WHERE an advice can be invoked. In Spring AOP, 
	 * 	JoinPoints take the form of an object injected into an advice by Spring AOP. This object contains information about the 
	 * 	current state of the runtime. (Remember, in Spring AOP, advices are themsleves triggered by method invocation. )
	 * 
	 * Points are expressions that are used to select SPECIFIC joinpoints. In otherwords, pointcuts targets are a subset of all joinpoints. 
	 * 	Points take the form of a expression (a string that uses regex). 
	 * 
	 * pointcut expression symbols:
	 * 	"*" is our wildcard for return types and method naming
	 * ".." is our wildcard for our parameter list (for any number of parameters)
	 * "*" is ALSO our wildcard for a SINGLE parameter in the parameter list
	 */
	@Before("execution(* *(..))")
	public void warmingUp(JoinPoint jp) {
		System.out.println("Stretch before your method!");
	}
}
