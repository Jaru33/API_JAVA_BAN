package three;

public class ExceptionFlowTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;

		int num = 0;

		String[] strArr = new String[3];

		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
//			System.out.println(0/0); //수학적 문제
//			str.charAt(1); //null 조작문제
			strArr[4] = "123"; // 배열 잘못된 접근 문제
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println(5);
			System.out.println("수학적 문제");
		} catch (NullPointerException e) {
			System.out.println(7);
			System.out.println("null 조작 문제");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(8);
			System.err.println("배열 잘못된 접근 문제");
		} finally {
			System.out.println(9);
		}

		System.out.println(10);

	}

}
