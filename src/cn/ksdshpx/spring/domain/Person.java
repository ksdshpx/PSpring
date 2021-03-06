package cn.ksdshpx.spring.domain;

public class Person {
	private String name;//成员变量

	public Person() {
		super();
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	// 自定义方法
	public void sayHelle() {
		System.out.println("Hello," + name);
	}
}
