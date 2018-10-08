package cn.ksdshpx.spring.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ksdshpx.spring.domain.Jeep;

/**
 * @author peng.x
 * @date 2018年10月8日 下午3:54:49
 * 测试bean的生命周期
 */
public class TestLifecycle {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
		Jeep jeep = ctx.getBean("jeep",Jeep.class);
		System.out.println("===>4.使用bean对象"+jeep);
		//关闭IOC容器
		ctx.close();
	}
}
