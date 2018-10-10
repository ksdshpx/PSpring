package cn.ksdshpx.spring.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.ksdshpx.spring.annotation.service.UserService;

/**
 * @author peng.x
 * @date 2018年10月10日 上午10:51:13
 */
/**
 * @Controller作用：相当于在xml文件中添加了
 * 					<bean id="userController" class="cn.ksdshpx.spring.annotation.controller.UserController>
 * 					</bean>
 * 					注解默认的id是类名的首字母小写，也可以自己给定，@Controller(value="id值")，可以简写为@Controller("id值")
 * 
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	public void register() {
		userService.handleAdd();
	}
}