import java.util.Scanner;

public class Ch4Flow4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int user = 0;
		int com = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요");
		
		user = scan.nextInt();
		
		com = (int)(Math.random()*3) + 1; // Math.random()*a  => 범위 0.0~a 까지 난수생성
		
		System.out.println("당신은"+ user + "입니다");
		System.out.println("COM은" + com + "입니다");
		
		switch (user - com) {
		case 2: case -1:
			System.out.println("당신이 졌습니다");
		break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다");
		break;
		case 0:
			System.out.println("비겼습니다");
		break;
		default:
			break;
		}
	}

}
