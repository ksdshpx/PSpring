package cn.ksdshpx.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ksdshpx.spring.domain.Car;

/**
 * 测试依赖注入
 * 
 * @author peng.x
 * @date 2018年9月23日 下午8:19:04
 */
public class TestDI {
	@Test
	public void testSet() {
		// 1.创建IOC容器对象
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.获取Car对象
		Car car = applicationContext.getBean("car", Car.class);
		System.out.println(car);
	}
}
