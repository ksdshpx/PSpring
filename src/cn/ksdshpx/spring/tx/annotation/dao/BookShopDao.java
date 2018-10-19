package cn.ksdshpx.spring.tx.annotation.dao;

/**
 * @author peng.x
 * @date 2018年10月19日 上午9:57:21
 */
public interface BookShopDao {
	// 根据书号查询书的价格
	public abstract Integer findPriceByIsbn(String isbn);

	// 根据书号更新书的库存
	public abstract void updateBookStock(String isbn);

	// 更新用户账户余额
	public abstract void updateUserAccount(String username, Integer price);
}
