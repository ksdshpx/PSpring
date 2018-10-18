package cn.ksdshpx.spring.jdbctemplate;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import cn.ksdshpx.spring.domain.User;

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

	@Test
	public void testQueryForObjectReturnObj() {
		String sql = "SELECT * FROM t_user WHERE id = ?";
		Object[] params = { 3 };
		User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), params);
		System.out.println(user);
	}

	@Test
	public void testQueryForObjectReturnVal() {
		String sql = "SELECT COUNT(*) FROM t_user";
		Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
		System.out.println(count);
	}

	@Test
	public void testQuery() {
		String sql = "SELECT * FROM t_user WHERE id > ?";
		Object[] params = { 1 };
		List<User> list = jdbcTemplate.query(sql, params, new BeanPropertyRowMapper<>(User.class));
		System.out.println(list);
	}
}
