package two;

import java.util.Random;

public class ExceptionTest2Resolve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 100;
		int result = 0;

		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			try {

				result = num / rand.nextInt(10);
				System.out.println(i + "번째: " + result);

			} catch (ArithmeticException e) {
				System.out.println("숫자 0으로 나누시면 안돼요");
			}
		}

	}

}
