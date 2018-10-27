package cn.ksdshpx.spring.tx.annotation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.ksdshpx.spring.tx.annotation.exception.UserAccountException;

/**
 * @author peng.x
 * @date 2018年10月27日 上午9:57:04
 */
@Service("cashier")
public class CashierImpl implements Cashier {

	@Autowired
	private BookShopService bookShopService;

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, noRollbackFor = {
			UserAccountException.class },
			readOnly=false,
			timeout=3)
	@Override
	public void checkout(String username, List<String> isbns) {
		for (String isbn : isbns) {
			bookShopService.buyBook(username, isbn);
		}
	}

}
