package cn.ksdshpx.spring.domain;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author peng.x
 * @date 2018年9月28日 上午9:42:49
 */
public class CarFactoryBean implements FactoryBean<Car> {

	/**
	 * FactoryBean创建的具体的bean对象是由getObject方法决定的
	 */
	@Override
	public Car getObject() throws Exception {
		return new Car("别克", "通用", 260000);
	}

	/**
	 * 返回具体的bean对象的类型
	 */
	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	/**
	 * 返回bean对象是否是单例的，可以是单例，也可以是原型(非单例)的
	 */
	@Override
	public boolean isSingleton() {
		return true;
	}

}
