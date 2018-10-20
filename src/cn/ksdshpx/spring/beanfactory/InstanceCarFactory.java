package cn.ksdshpx.spring.beanfactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author peng.x
 * @date 2018年10月20日 下午6:23:01
 */
public class InstanceCarFactory {
	private Map<String, Car> maps;

	public InstanceCarFactory() {
		maps = new HashMap<>();
		maps.put("Audi", new Car("Audi", 500000.0));
		maps.put("Ford", new Car("Ford", 600000.0));
	}

	public Car getCar(String name) {
		return maps.get(name);
	}
}
