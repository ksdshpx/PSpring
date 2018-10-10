package cn.ksdshpx.spring.autowire;

/**
 * @author peng.x
 * @date 2018年10月9日 下午1:47:46
 */
public class Address {
	private String province;
	private String city;

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [province=" + province + ", city=" + city + "]";
	}

}
