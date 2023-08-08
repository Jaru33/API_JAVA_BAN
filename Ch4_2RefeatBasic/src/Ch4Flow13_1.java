import java.util.Scanner;

public class Ch4Flow13_1 {

	public static void main(String[] args) {
		
//		UP and DOWN 게임
		int input = 0;
		int answer = 0;
		
		Scanner scan = new Scanner(System.in);
		
		answer = (int)(Math.random()*20) +1;
		
		boolean flag = true; //강제 트루로 프로그램 무한히진행
		
		while(flag) {
			System.out.println("1과 20사이의 정수를 입력해주세요: ");
			input = scan.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시입력해주세요");
			}else if(input< answer) {
				System.out.println("더 큰수로 다시 입력해주세요");
			}else {
				flag = false;
			}
		}
		System.out.println("정답을 맞추셨습니다!!"); 
		System.out.println("님이 입력한 값: " + input);
		System.out.println("정답 값: "+ answer);
		
		System.out.println("다음에 또 이용해주세요");
			
		
	}

}
