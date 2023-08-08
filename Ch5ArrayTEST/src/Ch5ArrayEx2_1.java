
public class Ch5ArrayEx2_1 {

	public static void main(String[] args) {

//		1~5의 숫자를 배열에 입력한다
//		
//		이들을 내림차순으로 정렬한다
//		순차적으로 출력한다
//		
//		출력형태(내림차순)
//		
//		
//		
//		
//		
		
//		
		int[] numArr = {
				1, 5, 7, 10, 3
		};
		int tempNum = 0;
		
			for (int i = 0; i < numArr.length; i++) {
				System.out.print(numArr[i]+"\t");
			}
			for (int i = 0; i < numArr.length; i++) {
				for (int j = 0; j < numArr.length-1; j++) {
					if(numArr[j]>numArr[j+1]) {
						tempNum = numArr[j+1];
						numArr[j+1] = numArr[j];
						numArr[j] = tempNum;
					}
				}
			}
			System.out.println();
			for (int i = 0; i < numArr.length; i++) {
				System.out.print(numArr[i]+"\t");
			}
		

		
		
	}
}
