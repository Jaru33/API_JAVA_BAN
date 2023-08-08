import java.util.Scanner;

public class Ch4Flow15_2 {

	public static void main(String[] args) {
			
//3차원
//		*
//		**
//		***
//		문제가 처음이라 좀 어려운 경우?
//		System.out.print("*");
//		System.out.println();
//		
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
		
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
		
		for (int i = 0; i < 2; i++) {//첫번째 for문은 줄 세로 
			for (int j = 0; j <= i; j++) {//두번째 for문은 가로 
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
