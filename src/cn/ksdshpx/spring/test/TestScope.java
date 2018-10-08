package cn.ksdshpx.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ksdshpx.spring.domain.Bike;

/**
 * @author peng.x
 * @date 2018年10月8日 下午2:42:47
 */
public class TestScope {
	@Test
	public void testSingleton() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bike bike = ctx.getBean("bike", Bike.class);
		Bike bike2 = ctx.getBean("bike", Bike.class);
		System.out.println(bike == bike2);//true
	}
	
	@Test
	public void testPrototype() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bike bike = ctx.getBean("bike2", Bike.class);
		Bike bike2 = ctx.getBean("bike2", Bike.class);
		System.out.println(bike == bike2);//false
	}
	
	
}
