package cn.ksdshpx.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ksdshpx.spring.domain.Car;

/**
 * @author peng.x
 * @date 2018年9月28日 上午9:47:36
 */
public class TestFactoryBean {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = ctx.getBean("car6", Car.class);
		System.out.println(car);
	}
}
