package one;

public class StringBasic2 {

// String 클래스에 대해 알아보자
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println(1 + " ");
		System.out.println("abc" == str1);
		
		System.out.println(2 + " ");
		System.out.println("abc" == str2);
		
		System.out.println(3 + " ");
		System.out.println("abc" == str3);
		
		System.out.println(4 + " ");
		System.out.println("abc" == str4);
		
		System.out.println();
		
		System.out.println(5 + " ");
		System.out.println("str3 == str4 ? ");
		System.out.println(str3 == str4);
	
		System.out.println(6 + " ");
		System.out.println("str1 == str2 ? ");
		System.out.println(str1 == str2);
		
		System.out.println(7 + " ");
		System.out.println("str1.equals(str4) ? ");
		System.out.println(str1.equals(str4));
		
		System.out.println(8 + " ");
		System.out.println("str3.equals(str4) ? ");
		System.out.println(str3.equals(str4));
		
		
		
		
	}

}
