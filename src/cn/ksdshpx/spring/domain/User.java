package cn.ksdshpx.spring.domain;

/**
 * @author peng.x
 * @date 2018年10月18日 上午9:51:59
 */
public class User {
	private Integer id;
	private String username;
	private String password;
	private Integer age;
	private String gender;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", age=" + age + ", gender="
				+ gender + "]";
	}

}
