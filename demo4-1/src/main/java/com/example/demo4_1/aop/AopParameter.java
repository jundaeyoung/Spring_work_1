package com.example.demo4_1.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopParameter {
	
	@Pointcut("execution(* com.example.demo4_1.controller..*.*(..))")
	private void cut() {
		
	}
	
	@Before("cut()")
	public void before(JoinPoint joinPoint) {
		System.out.println("before 수행!!");
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		Method method = methodSignature.getMethod();
		
		Object[] args = joinPoint.getArgs();
		
		for (Object obj : args) {
			System.out.println("type : " + obj.getClass().getSimpleName());
			System.out.println("value : " + obj);
		}
		System.out.println("사용된 메서드 확인");
		System.out.println(method.getName());
		
	}
		@AfterReturning(value="cut()",returning ="obj")
		public void afterReturn(JoinPoint joinPoint, Object obj) {
			System.out.println("==============");
			System.out.println("return obj");
			System.out.println("obj : " + obj);
		
	}
}
