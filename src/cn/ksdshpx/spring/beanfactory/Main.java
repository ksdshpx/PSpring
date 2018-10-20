package cn.ksdshpx.spring.beanfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author peng.x
 * @date 2018年10月20日 下午6:21:12
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-createbean.xml");
		Car car = ctx.getBean("car", Car.class);
		System.out.println(car);
		car = ctx.getBean("car2", Car.class);
		System.out.println(car);
	}
}
