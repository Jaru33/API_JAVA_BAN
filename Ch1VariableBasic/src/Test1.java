import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int num2 = 0;
		
		
		Scanner scan = new Scanner(System.in); 
		Scanner scan2 = new Scanner(System.in);
		
		
		System.out.println("사용자님 첫 번째 숫자를 입력해주세요.");
		num = scan.nextInt();
		System.out.println("사용자님 두 번째 숫자를 입력해주세요.");
		num2 =scan2.nextInt();
		System.out.println();
		
		System.out.println("결과: "+num*num2);
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
		
		
		
	}

}
