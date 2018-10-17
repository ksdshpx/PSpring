package cn.ksdshpx.spring.aspectj.annotation;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author peng.x
 * @date 2018年10月16日 下午1:52:51
 */
@Component
@Aspect
@Order(2)
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
	 * 获取方法的返回值：通过returning来指定一个名字，必须要与方法的形参名一致
	 * 
	 * @param joinPoint
	 */
	@AfterReturning(value = "execution(* cn.ksdshpx.spring.aspectj.annotation.*.*(..))", returning = "result")
	public void afterReturnningMethod(JoinPoint joinPoint, Object result) {
		// 得到方法名
		String methodName = joinPoint.getSignature().getName();
		System.out.println("LoggingAspectJ ==> The method " + methodName + " end with " + result);
	}

	/**
	 * 异常通知：在目标方法抛出异常后执行 
	 * 获取方法的异常：通过throwing来指定一个名字，必须要与方法的形参名一致
	 * 可以通过形参中异常的类型来设置抛出指定异常才会执行异常通知==>ArithmeticException
	 * 
	 * @param joinPoint
	 */
	@AfterThrowing(value = "execution(* cn.ksdshpx.spring.aspectj.annotation.*.*(..))", throwing = "ex")
	public void afterThrowingMethod(JoinPoint joinPoint, Exception ex) {
		// 得到方法名
		String methodName = joinPoint.getSignature().getName();
		System.out.println("LoggingAspectJ ==> The method " + methodName + " occurs Exception " + ex);
	}
	
	/**
	 * 环绕通知：一个顶4个，环绕着目标方法执行，可以理解为 前置 后置 返回 异常通知的结合体，更像是动态代理的整个过程
	 */
	@Around("execution(* cn.ksdshpx.spring.aspectj.annotation.*.*(..))")
	public Object aroundMethod(ProceedingJoinPoint pjp) {
		//执行目标方法
		try {
			//前置
			Object result = pjp.proceed();
			//返回
			return result;
		} catch (Throwable e) {
			//异常
			e.printStackTrace();
		}finally {
			//后置
		}
		return null;
	}
}
