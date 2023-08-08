import java.util.Scanner;

public class KeyboardInputEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in); //System.in은 사용자가 입력한 값
		int num = 0;
		
		System.out.println("숫자 하나를 입력해주세요");
		num = scan.nextInt(); //숫자입력기다리는중 
		
		System.out.print("당신이 입력한 숫자는: ");
		System.out.println(num + "입니다");
	}

}
