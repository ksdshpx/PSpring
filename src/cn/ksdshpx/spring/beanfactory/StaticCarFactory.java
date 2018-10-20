package cn.ksdshpx.spring.beanfactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author peng.x
 * @date 2018年10月20日 下午4:34:45
 */
public class StaticCarFactory {
	private static Map<String, Car> maps = new HashMap<>();
	static {
		maps.put("Audi", new Car("Audi", 300000.0));
		maps.put("Ford", new Car("Ford", 400000.0));
	}

	public static Car getCar(String name) {
		return maps.get(name);
	}
}
