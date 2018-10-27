package cn.ksdshpx.spring.tx.annotation.service;

import java.util.List;

/**
 * @author peng.x
 * @date 2018年10月27日 上午9:56:00
 */
public interface Cashier {
	public abstract void checkout(String username, List<String> isbns);
}
