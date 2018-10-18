package cn.ksdshpx.spring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author peng.x
 * @date 2018年10月18日 下午10:07:10
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-spel.xml");
		Address address = ctx.getBean("address", Address.class);
		System.out.println(address);
		Car car = ctx.getBean("car", Car.class);
		System.out.println(car);
		Person person = ctx.getBean("person", Person.class);
		System.out.println(person);
	}
}
