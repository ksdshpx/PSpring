package cn.ksdshpx.spring.tx.annotation.exception;

/**
 * @author peng.x
 * @date 2018年10月19日 上午10:05:43
 */
public class BookStockException extends RuntimeException {

	public BookStockException() {
		super();
	}

	public BookStockException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BookStockException(String message, Throwable cause) {
		super(message, cause);
	}

	public BookStockException(String message) {
		super(message);
	}

	public BookStockException(Throwable cause) {
		super(cause);
	}

}
