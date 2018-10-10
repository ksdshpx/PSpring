package cn.ksdshpx.spring.autowire;

/**
 * @author peng.x
 * @date 2018年10月9日 下午1:48:25
 */
public class Person {
	private String name;
	private Car car;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", car=" + car + ", address=" + address + "]";
	}

}
