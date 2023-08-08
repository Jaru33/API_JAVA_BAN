package ezen2.one;

public class InstaceOfBasic {
	
	public static void main(String[] args) {
		
		Product p = null;
		
		Book book = new Book();
		Tv tv = new Tv();
		
		p = book;
//		true이면 형변환이 된다 => 상속관계다
		
		System.out.println(p instanceof Book);
		System.out.println(p instanceof Tv);
//		타입체크
		if (p instanceof Book) {
			System.out.println("이건 책이야");
			
//			p.use();
			Book tempBook = (Book)p;
			tempBook.use();
		}else {
			System.out.println("이건 Tv야");
			
			Tv tempTv = (Tv)p;
			tempTv.use();
//			((Tv)p).use();
			
		}
		
		
		
	}
}
