package cn.ksdshpx.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ksdshpx.spring.annotation.controller.UserController;
import cn.ksdshpx.spring.annotation.dao.UserDao;
import cn.ksdshpx.spring.annotation.service.UserService;

/**
 * @author peng.x
 * @date 2018年10月10日 上午11:10:06
 */
public class TestAnnotation {
	@Test
	public void testAnnotation() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-annotation.xml");
		UserController userController = ctx.getBean("userController", UserController.class);
		System.out.println("UserController:" + userController);
		UserService userService = ctx.getBean("userServiceImpl", UserService.class);
		System.out.println("UserService:" + userService);
		UserDao userDao = ctx.getBean("userDaoJdbcImpl", UserDao.class);
		System.out.println("UserDao:" + userDao);
	}
}
