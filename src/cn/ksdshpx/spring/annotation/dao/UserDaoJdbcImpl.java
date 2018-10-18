package cn.ksdshpx.spring.annotation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.ksdshpx.spring.domain.User;

/**
 * @author peng.x
 * @date 2018年10月10日 上午10:52:29
 */
@Repository
public class UserDaoJdbcImpl implements UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addUser(User user) {
		String sql = "INSERT INTO t_user(username,password,age,gender) VALUES(?,?,?,?)";
		Object[] params = { user.getUsername(), user.getPassword(), user.getAge(), user.getGender() };
		jdbcTemplate.update(sql, params);
	}

}
