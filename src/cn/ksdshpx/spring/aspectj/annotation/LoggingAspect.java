package cn.ksdshpx.spring.aspectj.annotation;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author peng.x
 * @date 2018年10月16日 下午1:52:51
 */
@Component
@Aspect
public class LoggingAspect {
	/**
	 * 前置通知:在目标方法执行前执行，不管目标方法是否抛出异常都会执行
	 */
	@Before("execution(public int cn.ksdshpx.spring.aspectj.annotation.ArithmeticCalculatorImpl.add(int,int))")
	public void beforeMethod(JoinPoint joinPoint) {
		// 得到方法名
		String methodName = joinPoint.getSignature().getName();
		// 得到参数
		Object[] args = joinPoint.getArgs();
		System.out.println("LoggingAspectJ ==> The method " + methodName + " begin with " + Arrays.asList(args));
	}

	/**
	 * 后置通知：在目标方法执行后执行，不管目标方法是否抛出异常都会执行，但是无法得到目标方法返回的结果
	 */
	@After("execution(* cn.ksdshpx.spring.aspectj.annotation.*.*(..))")
	public void afterMethod(JoinPoint joinPoint) {
		// 得到方法名
		String methodName = joinPoint.getSignature().getName();
		System.out.println("LoggingAspectJ ==> The method " + methodName + " ends");
	}

	/**
	 * 返回通知：在目标方法正常结束后执行
	 * 
	 * @param joinPoint
	 */
	@AfterReturning(value = "execution(* cn.ksdshpx.spring.aspectj.annotation.*.*(..))", returning = "result")
	public void afterReturnningMethod(JoinPoint joinPoint, Object result) {
		// 得到方法名
		String methodName = joinPoint.getSignature().getName();
		System.out.println("LoggingAspectJ ==> The method " + methodName + " end with " + result);

	}
}
