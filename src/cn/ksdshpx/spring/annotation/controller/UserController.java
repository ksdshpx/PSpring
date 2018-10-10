package cn.ksdshpx.spring.annotation.controller;

import org.springframework.stereotype.Controller;

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

}