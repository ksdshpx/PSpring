package cn.ksdshpx.spring.tx.xml.test;
/**
 * @author peng.x
 * @date 2018年10月19日 上午10:49:59
 */

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ksdshpx.spring.tx.xml.dao.BookShopDao;
import cn.ksdshpx.spring.tx.xml.service.BookShopService;

public class TestTransaction {
	private BookShopService bookShopService;
	private BookShopDao bookShopDao;

	@Before
	public void init() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-tx-xml.xml");
		bookShopService = ctx.getBean("bookShopServiceImpl", BookShopService.class);
		bookShopDao = ctx.getBean("bookShopDaoImpl", BookShopDao.class);
	}

	@Test
	public void testTx() {
		bookShopService.buyBook("Tom", "ISBN-001");
	}
}
