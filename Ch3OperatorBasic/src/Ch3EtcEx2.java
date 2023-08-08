import java.util.Scanner;

public class Ch3EtcEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		홀짝 판별 프로그램을 완성하시오
		
//		홀수면 홀
//		짝수면 짝이다 라고 출력하는 프로그램을 
//		완성하시오
//
//		출력 ex
//		1
//		1은 홀입니다
//
//		10
//		10은 짝입니다
		Scanner scan = new Scanner(System.in);
		int a = 0;
		String resultStr = "";
		
			
		System.out.println("숫자 하나를 입력해주세요");
		
		a = scan.nextInt();
		resultStr = (a%2 == 1) ? "홀입니다" : "짝입니다" ;
		System.out.println(a);
		System.out.println(a +"은(는) " +resultStr);
		
	}

}
