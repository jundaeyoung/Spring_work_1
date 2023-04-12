package com.example.demo4.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component // IoC의 관리대상이 된다.
public class AopParameter {

	// 포인트 컷
	// role 설정
	// execution 표현식
	@Pointcut("execution(* com.example.demo4.controller..*.*(..))")
	private void cut() {
	}

	// cut() 메서드가 실행되는 지점 이전에 before() 메서드를 실행시킬거야
	@Before("cut()")
	public void before(JoinPoint joinPoint) {

		System.out.println("before 수행!!");
		// 활용 - 어떤 메서드가 동작되었는지 확인
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		Method method = methodSignature.getMethod();

		Object[] args = joinPoint.getArgs();

		// 매개 변수 출력
		for (Object obj : args) {
			System.out.println("type : " + obj.getClass().getSimpleName());
			System.out.println("value : " + obj);
		}

		System.out.print("사용된 메서드 확인 ");
		System.out.println(method.getName());
		// controller -> /api/get 호출하기 전에 수행 되는 녀석
	}

	@AfterReturning(value = "cut()", returning = "obj")
	public void afterReturn(JoinPoint joinPoint, Object obj) {
		System.out.println("===================");
		System.out.println("return obj");
		System.out.println("obj : " + obj);
	}

}
