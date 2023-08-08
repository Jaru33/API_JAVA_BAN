import java.util.Scanner;

public class Ch4FlowEx4 {

	public static void main(String[] args) {
		
//		사계절
//		봄여름가을겨울
//		1~12
//      스위치
	      
//      출력예시
//      현재 월을 입력하세요.> 3
//      현재의 계절은 봄입니다.
      
//      현재 월을 입력하세요.> 12
//      현재의 계절은 겨울입니다.
		
		Scanner sc = new Scanner(System.in);
		
		int monthNum = 0;
		String seasonStr = "";
		
		System.out.print("현재 월을 입력하세요.> ");
		monthNum = sc.nextInt();
		switch (monthNum) {
			case 3: case 4: case 5:
				seasonStr = "현재의 계절은 봄입니다.";
				break;
			case 6: case 7: case 8: 
				seasonStr = "현재의 계절은 여름입니다.";
				break;
			case 9: case 10: case 11:
				seasonStr = "현재의 계절은 가을입니다.";
				break;
			case 12: case 1: case 2:
				seasonStr = "현재의 계절은 겨울입니다.";
				break;
			default: seasonStr = "1 ~ 12 사이의 숫자를 입력해주세요";
				break;
		}
		
		System.out.println(seasonStr);
	}

}
