import java.util.Scanner;

public class Ch4Flow17 {

	public static void main(String[] args) {
//		break문
//		자신이 포함된 가장 가까운 반복문을 벗어난다
		int sum = 0;
		int cnt = 0;
// 무한루프
		while(true) {
			if(sum>100) {
				break;
			}
			cnt++;
			sum = sum + cnt;
		}
		
		System.out.println(sum);
	}

}
