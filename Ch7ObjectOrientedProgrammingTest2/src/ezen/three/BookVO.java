package ezen.three;

//BookvalueObject 브이오 객체
public class BookVO {

	private String title = ""; // 제목
	private String author = ""; // 저자
	private String publicher = ""; // 출판사
	private int price = 0; // 가격
	private String publicationDate = ""; // 출판날짜

	public BookVO() { // 기본생성자
		super();
	}

	public BookVO(String title, String author, String publicher // 모든인스턴스 포함하는 만능생성자
			, int price, String publicationDate) {
		super();
		this.title = title;
		this.author = author;
		this.publicher = publicher;
		this.price = price;
		this.publicationDate = publicationDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublicher() {
		return publicher;
	}

	public void setPublicher(String publicher) {
		this.publicher = publicher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", publicher=" + publicher + ", price=" + price
				+ ", publicationDate=" + publicationDate + "]";
	}

}
