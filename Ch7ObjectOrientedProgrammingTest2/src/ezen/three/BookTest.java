package ezen.three;


public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookVO book = new BookVO();
		BookVO book2 = new BookVO();
		BookVO book3 = new BookVO();
		
		//book1 set
		book.setTitle("지적 대화를 위한 넓고 얕은 지식");
		book.setAuthor("채사장");
		book.setPublicher("웨일북");
		book.setPrice(12900);
		book.setPublicationDate("20년02월01일");
		//book1 print
//		System.out.println("책 제목: " + book.getTitle());
//		System.out.println("책 저자: " + book.getAuthor());
//		System.out.println("책 출판사: " + book.getPublicher());
//		System.out.println("책 가격: " + book.getPrice() + "원");
//		System.out.println("책 출판날짜: " + book.getPublicationDate());
		
		System.out.println(book.toString());
		
		//book2 set
		book2.setTitle("돈의심리학");
		book2.setAuthor("모건 하우절");
		book2.setPublicher("인플루엔셜");
		book2.setPrice(17800);
		book2.setPublicationDate("21년01월13일");
		//book2 print
//		System.out.println("책 제목: " + book2.getTitle());
//		System.out.println("책 저자: " + book2.getAuthor());
//		System.out.println("책 출판사: " + book2.getPublicher());
//		System.out.println("책 가격: " + book2.getPrice() + "원");
//		System.out.println("책 출판날짜: " + book2.getPublicationDate());
//		System.out.println();
		
		System.out.println(book2.toString());
		
		//book3 set
		book3.setTitle("그리고 아무도 없었다");
		book3.setAuthor("해문출판사");
		book3.setPublicher("애거사 크리스티");
		book3.setPrice(10800);
		book3.setPublicationDate("02년05월25일");
		//book3 print
//		System.out.println("책 제목: " + book3.getTitle());
//		System.out.println("책 저자: " + book3.getAuthor());
//		System.out.println("책 출판사: " + book3.getPublicher());
//		System.out.println("책 가격: " + book3.getPrice() + "원");
//		System.out.println("책 출판날짜: " + book3.getPublicationDate());
//		System.out.println();
		
		System.out.println(book3.toString());
	}

}
