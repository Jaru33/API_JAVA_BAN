import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0;
		int secondNum = 0;
		long num3 = 0;
		Scanner scan = new Scanner(System.in); 
		Scanner scan2 = new Scanner(System.in);
		
		
		
		
		System.out.println("사용자님 첫 번째 숫자를 입력해주세요.");
		firstNum = scan.nextInt();
		
		System.out.println("사용자님 두 번째 숫자를 입력해주세요.");
		secondNum =scan2.nextInt();
		System.out.println();

		num3 = (long)firstNum *secondNum;
		
		System.out.println("결과: "+num3);
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
		
		
		
	}

}
