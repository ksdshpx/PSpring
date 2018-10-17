package cn.ksdshpx.spring.aspectj.xml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author peng.x
 * @date 2018年10月17日 下午3:29:04
 */
public class ValidationAspect {
	//@Before("execution(* cn.ksdshpx.spring.aspectj.annotation.*.*(..))")
	@Before("cn.ksdshpx.spring.aspectj.annotation.LoggingAspect.declarePointCut()")
	public void beforeMethod(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.println("ValidationAspect==> The method " + methodName + " begin with " + Arrays.asList(args));
	}
}
