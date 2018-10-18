package cn.ksdshpx.spring.spel;

/**
 * @author peng.x
 * @date 2018年10月18日 下午10:02:41
 */
public class Car {
	private String brand;
	private Double price;
	private Double tyreParimeter;

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

	public Double getTyreParimeter() {
		return tyreParimeter;
	}

	public void setTyreParimeter(Double tyreParimeter) {
		this.tyreParimeter = tyreParimeter;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", tyreParimeter=" + tyreParimeter + "]";
	}

}
