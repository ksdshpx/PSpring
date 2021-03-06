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
		System.out.println("Car's Constructor!");
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
		System.out.println("brand:" + brand);
		this.brand = brand;
	}

	public String getCrop() {
		return crop;
	}

	public void setCrop(String crop) {
		System.out.println("crop:" + crop);
		this.crop = crop;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		System.out.println("price:" + price);
		this.price = price;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		System.out.println("speed:" + speed);
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", crop=" + crop + ", price=" + price + ", speed=" + speed + "]";
	}

}
