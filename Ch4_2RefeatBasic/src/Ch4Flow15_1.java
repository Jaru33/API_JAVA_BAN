import java.util.Scanner;

public class Ch4Flow15_1 {

	public static void main(String[] args) {
		
	int num = 0;
		for(int i=1; i<=9; i++) {
			for(int n = 2;n<=9; n++) {
				System.out.println("외부 for문: " + i);
				System.out.println("내부 for문: " + n);
				num = n;
			}
			System.out.println("====내부 for문이 끝남 ====");
			System.out.println("외부 for문: " + i);
			System.out.println("내부 for문: " + num);// n은 내부for문이 끝나면 소멸되므로 num이란변수추가함.
			System.out.println();
			
		}
	}

}
