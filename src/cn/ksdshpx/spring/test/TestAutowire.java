package cn.ksdshpx.spring.test;
/**
 * @author peng.x
 * @date 2018年10月10日 上午10:16:53
 * 测试自动装配
 */

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ksdshpx.spring.autowire.Person;

public class TestAutowire {
	@Test
	public void testByName() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-autowire.xml");
		Person person = ctx.getBean("person", Person.class);
		System.out.println(person);
	}
}
