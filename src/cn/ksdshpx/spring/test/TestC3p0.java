package cn.ksdshpx.spring.test;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author peng.x
 * @date 2018年10月9日 上午10:09:06
 */
public class TestC3p0 {
	@Test
	public void testDataSource() throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-dataSource.xml");
		DataSource dataSource = ctx.getBean("dataSource", DataSource.class);
		System.out.println(dataSource);
		System.out.println(dataSource.getConnection());
	}
}
