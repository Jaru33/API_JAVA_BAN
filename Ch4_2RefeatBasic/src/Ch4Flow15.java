import java.util.Scanner;

public class Ch4Flow15 {

	public static void main(String[] args) {
		
//	중첩 반복문(중첩for문)
//		
//	2 * 1 = 2		3 * 1 = 3				9 * 1 = 9
//	2 * 2 = 4		3 * 2 = 6				9 * 2 = 18
//	2 * 3 = 6		3 * 3 = 9				9 * 3 = 27
//	2 * 4 = 8		3 * 4 = 12				9 * 4 = 36
//	2 * 5 = 10		3 * 5 = 15	,,,			9 * 5 = 45
//	2 * 6 = 12		3 * 6 = 18				9 * 6 = 54
//	2 * 7 = 14		3 * 7 = 21				9 * 7 = 63
//	2 * 8 = 16		3 * 8 = 24				9 * 8 = 72
//	2 * 9 = 18		3 * 9 = 27				9 * 9 = 81
	
		for(int i=1; i<=9; i++) {
			for(int n = 2;n<=9; n++) {
				System.out.print(n+" * "+i+" = "+(n*i) + "\t");
			}
			System.out.println();
			
		}
	}

}
