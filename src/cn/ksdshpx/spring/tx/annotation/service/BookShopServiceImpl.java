package cn.ksdshpx.spring.tx.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ksdshpx.spring.tx.annotation.dao.BookShopDao;

/**
 * @author peng.x
 * @date 2018年10月19日 上午10:20:00
 */
@Service
public class BookShopServiceImpl implements BookShopService {
	@Autowired
	private BookShopDao bookShopDao;

	@Override
	public void buyBook(String username, String isbn) {
		Integer price = bookShopDao.findPriceByIsbn(isbn);
		bookShopDao.updateBookStock(isbn);
		bookShopDao.updateUserAccount(username, price);
	}

}
