package ezen2.one;

public class Book extends Product {
	public Book() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(1); 
	}
	
	public void use() {
		System.out.println("Book 을 사용중");
	}

	public String toString() { // Object클래스의 toString()을 오버라이딩한다.
		return "Book";
	}
}
