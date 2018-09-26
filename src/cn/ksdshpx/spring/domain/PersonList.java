package cn.ksdshpx.spring.domain;

import java.util.List;

/**
 * @author peng.x
 * @date 2018年9月26日 上午10:19:13
 */
public class PersonList {
	private String name;
	private List<Car> cars;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "PersonList [name=" + name + ", cars=" + cars + "]";
	}

}
