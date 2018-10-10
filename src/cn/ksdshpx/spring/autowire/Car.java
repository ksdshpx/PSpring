package cn.ksdshpx.spring.autowire;

/**
 * @author peng.x
 * @date 2018年10月9日 下午1:47:11
 */
public class Car {
	private String brand;
	private Double price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}

}
