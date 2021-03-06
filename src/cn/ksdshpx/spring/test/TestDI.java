package cn.ksdshpx.spring.test;

import java.lang.reflect.Constructor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ksdshpx.spring.domain.Book;
import cn.ksdshpx.spring.domain.Car;
import cn.ksdshpx.spring.domain.DataSource;
import cn.ksdshpx.spring.domain.PersonList;
import cn.ksdshpx.spring.domain.PersonMap;
import cn.ksdshpx.spring.domain.Student;

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

	@Test
	public void testP() {
		// 1.创建IOC容器对象
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.获取Car对象
		Car car = applicationContext.getBean("car4", Car.class);
		System.out.println(car);
	}

	@Test
	public void testZML() {
		// 1.创建IOC容器对象
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.获取Book对象
		Book book = applicationContext.getBean("book", Book.class);
		System.out.println(book);
		book = applicationContext.getBean("book2", Book.class);
		System.out.println(book);
	}

	@Test
	public void testRefBean() {
		// 1.创建IOC容器对象
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.获取Student对象
		Student student = applicationContext.getBean("student", Student.class);
		System.out.println(student);
	}

	@Test
	public void testInnerBean() {
		// 1.创建IOC容器对象
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.获取Student对象
		Student student = applicationContext.getBean("student2", Student.class);
		System.out.println(student);
	}

	@Test
	public void testNull() {
		// 1.创建IOC容器对象
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.获取Student对象
		Student student = applicationContext.getBean("student3", Student.class);
		System.out.println(student);
	}

	@Test
	public void testList() {
		// 1.创建IOC容器对象
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.获取PersonList对象
		PersonList personList = applicationContext.getBean("personList", PersonList.class);
		System.out.println(personList);
	}

	@Test
	public void testMap() {
		// 1.创建IOC容器对象
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.获取PersonMap对象
		PersonMap personMap = applicationContext.getBean("personMap", PersonMap.class);
		System.out.println(personMap);
	}

	@Test
	public void testProperties() {
		// 1.创建IOC容器对象
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.获取PersonMap对象
		DataSource dataSource = applicationContext.getBean("dataSource", DataSource.class);
		System.out.println(dataSource);
	}

}
