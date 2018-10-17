package cn.ksdshpx.spring.aspectj.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author peng.x
 * @date 2018年10月16日 下午2:20:49
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-aspectj-annotation.xml");
		ArithmeticCalculator ac = ctx.getBean("arithmeticCalculatorImpl", ArithmeticCalculator.class);
		System.out.println(ac.getClass().getName());//com.sun.proxy.$Proxy7
		int result = ac.add(1, 5);
		System.out.println("Main Result:" + result);
//		result = ac.div(5, 0);
//		System.out.println("Main Result:" + result);
	}
}
