package cn.ksdshpx.spring.domain;

/**
 * @author peng.x
 * @date 2018年10月8日 下午3:49:45
 */
public class Jeep {
	private String brand;
	private Double price;

	public Jeep() {
		System.out.println("===>1.调用构造器创建bean对象");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("===>2.调用set方法为bean对象属性赋值");
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void init() {
		System.out.println("===>3.调用初始化方法");
	}

	public void destory() {
		System.out.println("===>5.调用销毁方法");
	}

	@Override
	public String toString() {
		return "Jeep [brand=" + brand + ", price=" + price + "]";
	}

}
