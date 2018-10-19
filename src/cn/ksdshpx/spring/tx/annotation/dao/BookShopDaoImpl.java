package cn.ksdshpx.spring.tx.annotation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.ksdshpx.spring.tx.annotation.exception.BookStockException;
import cn.ksdshpx.spring.tx.annotation.exception.UserAccountException;

/**
 * @author peng.x
 * @date 2018年10月19日 上午10:00:14
 */
@Repository
public class BookShopDaoImpl implements BookShopDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Integer findPriceByIsbn(String isbn) {
		String sql = "SELECT price FROM book WHERE isbn = ?";
		Object[] params = { isbn };
		return jdbcTemplate.queryForObject(sql, Integer.class, params);
	}

	@Override
	public void updateBookStock(String isbn) {
		String sql = "SELECT stock FROM book_stock WHERE isbn = ?";
		Object[] params = { isbn };
		Integer stock = jdbcTemplate.queryForObject(sql, Integer.class, params);
		if (stock <= 0) {
			throw new BookStockException("库存不足...");
		}
		sql = "UPDATE book_stock SET stock = stock - 1";
		jdbcTemplate.update(sql);
	}

	@Override
	public void updateUserAccount(String username, Integer price) {
		String sql = "SELECT balance FROM account WHERE username = ?";
		Object[] params = { username };
		Integer balance = jdbcTemplate.queryForObject(sql, Integer.class, params);
		if (balance < price) {
			throw new UserAccountException("余额不足...");
		}
		sql = "UPDATE account SET balance = balance - ? WHERE username = ?";
		params = new Object[] { price, username };
		jdbcTemplate.update(sql, params);
	}

}
