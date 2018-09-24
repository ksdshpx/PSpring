package cn.ksdshpx.spring.domain;

/**
 * @author peng.x
 * @date 2018年9月23日 下午8:15:08
 */
public class Car {
	private String brand;// 品牌
	private String crop;// 厂商
	private Double price;// 价格
	private Integer speed;// 速度

	public Car() {
		super();
	}

	public Car(String brand, String crop, Double price) {
		super();
		this.brand = brand;
		this.crop = crop;
		this.price = price;
	}

	public Car(String brand, String crop, Integer speed) {
		super();
		this.brand = brand;
		this.crop = crop;
		this.speed = speed;
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCrop() {
		return crop;
	}

	public void setCrop(String crop) {
		this.crop = crop;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", crop=" + crop + ", price=" + price + ", speed=" + speed + "]";
	}

}
