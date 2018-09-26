package cn.ksdshpx.spring.domain;

import java.util.Map;

/**
 * @author peng.x
 * @date 2018年9月26日 上午10:58:25
 */
public class PersonMap {
	private String name;
	private Map<String, Car> cars;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Car> getCars() {
		return cars;
	}

	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "PersonMap [name=" + name + ", cars=" + cars + "]";
	}

}
