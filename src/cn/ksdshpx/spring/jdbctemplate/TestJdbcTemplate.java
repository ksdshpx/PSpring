package cn.ksdshpx.spring.jdbctemplate;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author peng.x
 * @date 2018年10月18日 上午10:16:00
 */
public class TestJdbcTemplate {
	private JdbcTemplate jdbcTemplate;

	@Before
	public void init() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-jdbc.xml");
		jdbcTemplate = ctx.getBean("jdbcTemplate", JdbcTemplate.class);
	}

	@Test
	public void testUpdate() {
		String sql = "INSERT INTO t_user(username,password,age,gender) VALUES(?,?,?,?)";
		Object[] params = { "zhangSan", "123456", 25, "male" };
		jdbcTemplate.update(sql, params);
	}

	@Test
	public void testBatchUpdate() {
		String sql = "INSERT INTO t_user(username,password,age,gender) VALUES(?,?,?,?)";
		List<Object[]> paramsList = new ArrayList<>();
		paramsList.add(new Object[] { "liSi", "345346", 35, "female" });
		paramsList.add(new Object[] { "wangWu", "tre45", 18, "male" });
		paramsList.add(new Object[] { "zhaoLiu", "53teert", 88, "female" });
		jdbcTemplate.batchUpdate(sql, paramsList);
	}
}
