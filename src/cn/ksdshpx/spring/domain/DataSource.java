package cn.ksdshpx.spring.domain;

import java.util.Properties;

/**
 * @author peng.x
 * @date 2018年9月26日 下午4:58:08
 */
public class DataSource {
	private Properties props;

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "DataSource [props=" + props + "]";
	}
	
}
