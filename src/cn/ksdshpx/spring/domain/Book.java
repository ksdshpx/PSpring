package cn.ksdshpx.spring.domain;

/**
 * @author peng.x
 * @date 2018年9月25日 下午2:10:04
 */
public class Book {
	private String bookId;
	private String bookName;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}

}
