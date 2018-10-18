package cn.ksdshpx.spring.spel;

/**
 * @author peng.x
 * @date 2018年10月18日 下午10:01:58
 */
public class Address {
	private String city;
	private String street;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + "]";
	}

}
