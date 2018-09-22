package cn.ksdshpx.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ksdshpx.spring.domain.Person;

public class HelloWorld {
	public static void main(String[] args) {
		// 1.创建Spring的IOC容器
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.创建Person对象
		Person person = (Person) applicationContext.getBean("person");
		// 3.调用sayHello
		person.sayHelle();
	}
}
