package cn.ksdshpx.spring.test;

import java.lang.reflect.Constructor;

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

	@Test
	public void testConstructor() {
		// 1.创建IOC容器对象
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.获取Car对象
		Car car = applicationContext.getBean("car2", Car.class);
		System.out.println(car);
		Car car2 = applicationContext.getBean("car3", Car.class);
		System.out.println(car2);
	}

	@Test
	public void testReflect() {
		Class clazz = Car.class;
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			Class[] types = constructor.getParameterTypes();
			for (Class type : types) {
				System.out.print(type.getName() + ",");
			}
			System.out.println();
		}
	}
}
