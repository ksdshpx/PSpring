package cn.ksdshpx.spring.aspectj.annotation;

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
	  * 前置通知:在目标方法执行前执行
	 */
	@Before("execution(public int cn.ksdshpx.spring.aspectj.annotation.ArithmeticCalculatorImpl.add(int,int))")
	public void beforeMethod() {
		System.out.println("LoggingAspectJ method xxx begin with [i,j]");
	}
}
