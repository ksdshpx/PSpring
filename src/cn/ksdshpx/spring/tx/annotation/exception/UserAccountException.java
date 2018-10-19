package cn.ksdshpx.spring.tx.annotation.exception;

/**
 * @author peng.x
 * @date 2018年10月19日 上午10:09:23
 */
public class UserAccountException extends RuntimeException {

	public UserAccountException() {
		super();
	}

	public UserAccountException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UserAccountException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserAccountException(String message) {
		super(message);
	}

	public UserAccountException(Throwable cause) {
		super(cause);
	}

}
