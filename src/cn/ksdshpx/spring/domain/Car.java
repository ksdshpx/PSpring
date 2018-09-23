package cn.ksdshpx.spring.domain;

/**
 * @author peng.x
 * @date 2018年9月23日 下午8:15:08
 */
public class Car {
	private String brand;// 品牌
	private String crop;// 厂商
	private Double price;// 价格

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		System.out.println("setBrand:" + brand);
		this.brand = brand;
	}

	public String getCrop() {
		return crop;
	}

	public void setCrop(String crop) {
		System.out.println("setCrop:" + crop);
		this.crop = crop;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		System.out.println("setPrice:" + price);
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", crop=" + crop + ", price=" + price + "]";
	}

}
