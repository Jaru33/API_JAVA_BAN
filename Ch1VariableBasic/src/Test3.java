import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long firstNum = 0;
		long secondNum = 0;
		int num = 0;

		System.out.println("사용자님 첫 번째 숫자를 입력해주세요.");
		firstNum = scan.nextInt();

		System.out.println("사용자님 두 번째 숫자를 입력해주세요.");
		secondNum = scan.nextInt();

//		num = firstNum * secondNum;
//		num = (int)firstNum * (int)secondNum;
		num = (int)(firstNum * secondNum);
		
		System.out.println();
		System.out.println("결과: " + num);

		System.out.println();
		System.out.println("프로그램을 종료합니다.");
		
		
	}

}
