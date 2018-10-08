package cn.ksdshpx.spring.domain;
/**
 * @author peng.x
 * @date 2018年10月8日 下午2:39:47
 */
public class Bike {
	private String brand;
	private Double price;
	
	public Bike() {
		System.out.println("invoke Bike Constructor()...");
	}
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
		return "Bike [brand=" + brand + ", price=" + price + "]";
	}
	
}
