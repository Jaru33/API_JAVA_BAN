

import java.util.Scanner;

public class Ch5ArrayEx1_2 {

	public static void main(String[] args) {
	
		int playnum = 0;
		int cum = 0;
		int numw = 0;
		int cumw = 0;
		Scanner sc = new Scanner(System.in);

		for(int i =0;i<=4;i++) {
			System.out.print("동전의 갯수는 ?홀(1)짝(0) 골라골라~ ");
			cum = (int)(Math.random()*10)+1;
			playnum = sc.nextInt();

			System.out.println("동전:"+cum+"개");
			if(cum%2==playnum) {
				System.out.println("정답! 플레이어윈");	
				numw++;
			}else {
				System.out.println("틀렸습니다! 컴퓨터윈");
				cumw++;
			}
			
			if(numw==3) {
				System.out.println("플레이어 윈 프로그램을 종료합니다");
				numw++;
				break;
				
			}else if(cumw==3) {
				System.out.println("컴퓨터 윈 프로그램을 종료합니다");
				break;
			}
		}
	}

}
