import java.util.Scanner;

public class Ch4FlowEx3 {

	public static void main(String[] args) {
		
//		if
//		else 
//		를이용하여 홀짝 판별 프로그램을 만드시오 
		
//		사용자로부터 입력을 받음 
//		출력예시
//		홀짝? 1
//		홀
//		
//		홀짝? 12
//		짝
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.print("홀짝? ");
		num = sc.nextInt();
		if(num%2==1) {
			System.out.println("홀");
		}else {
			System.out.println("짝");
		}
		

	}

}
