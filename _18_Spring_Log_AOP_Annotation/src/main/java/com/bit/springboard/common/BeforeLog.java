package com.bit.springboard.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
//3. 애즈팩트 설정
@Aspect
public class BeforeLog {
	//1. 포인트컷 설정
	@Pointcut("execution(* com.bit.springboard.service..*Impl.*(..))")
	public void allPointcut() {}
	
	//2. 어드바이스 설정(시점)
	@Before("allPointcut()")
	public void beforeLog(JoinPoint jp) {
		// Signature 객체는 체이닝기법 사용가능
		// 현재 실행중인 포인트컷 메소드의 이름
		String methodName = jp.getSignature().getName();

		// 현재 실행중인 포인트컷 매개변수 Object로 받기
		Object[] methodArgs = jp.getArgs();
		if (methodArgs.length != 0) {
			System.out.println("[사전 처리]" + methodName + "()의 매개변수 정보: " + methodArgs[0].toString());
		} else {
			System.out.println("[사전 처리]" + methodName + "()는 매개변수가 없습니다.");
		}
	}
}
