package three;

public class ExceptionFlowTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;

		int num = 0;

		String[] strArr = new String[3];

		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0/0); //수학적 문제
			str.charAt(1); //null 조작문제
			strArr[4] = "123"; // 배열 잘못된 접근 문제
			System.out.println(4);
		} catch (Exception e) {//Exception 
			System.out.println(7);
			System.out.println("문제가 있나보네 조심히 다뤄");
		} finally {
			System.out.println(9);
		}

		System.out.println(10);

	}

}
