
public class Ch5ArrayEx6_5 {

	public static void main(String[] args) {
	
//		배열의 복사?

		
		int[] numArr = {
				1, 2
		};
		int[] newNumArr = new int[2];
		
		newNumArr[0] = numArr[0];
		newNumArr[1] = numArr[1];
		
		System.out.println("=======원본내용 =======");
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		
		System.out.println("=======복사된 내용======");
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(newNumArr[i]);
		}
		
		newNumArr[0] = 999;
		
		System.out.println("=======원본내용 =======");
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		
		System.out.println("=======복사된 내용======");
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(newNumArr[i]);
		}
	}

}
