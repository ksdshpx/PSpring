package cn.ksdshpx.spring.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ksdshpx.spring.annotation.dao.UserDao;

/**
 * @author peng.x
 * @date 2018年10月10日 上午10:52:00
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public void handleAdd() {
		userDao.addUser();
	}
}
