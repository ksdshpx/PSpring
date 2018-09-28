package cn.ksdshpx.spring.test;
/**
 * @author peng.x
 * @date 2018年9月28日 上午10:57:35
 */

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ksdshpx.spring.domain.Address;

public class TestRelation {
	@Test
	public void testExtends() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Address address1 = ctx.getBean("address1", Address.class);
		System.out.println(address1);
		Address address2 = ctx.getBean("address2", Address.class);
		System.out.println(address2);
	}

	@Test
	public void testDepends() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Address address = ctx.getBean("address3", Address.class);
		System.out.println(address);
	}
}
