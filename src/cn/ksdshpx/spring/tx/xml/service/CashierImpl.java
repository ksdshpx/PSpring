package cn.ksdshpx.spring.tx.xml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author peng.x
 * @date 2018年10月27日 上午9:57:04
 */
@Service("cashier")
public class CashierImpl implements Cashier {

	@Autowired
	private BookShopService bookShopService;

	@Override
	public void checkout(String username, List<String> isbns) {
		for (String isbn : isbns) {
			bookShopService.buyBook(username, isbn);
		}
	}

}
