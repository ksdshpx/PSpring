package cn.ksdshpx.spring.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * @author peng.x
 * @date 2018年10月10日 下午2:11:37
 */
@Repository("userDao")
public class UserDaoMybatisImpl implements UserDao {
	@Override
	public void addUser() {
		System.out.println("UserDao MyBatis AddUser...");
	}
}
