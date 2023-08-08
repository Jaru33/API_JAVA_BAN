package two;

import java.util.Random;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 100;
		int result = 0;

		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			result = num / rand.nextInt(10);
			System.out.println(result);
		}
	}

}
