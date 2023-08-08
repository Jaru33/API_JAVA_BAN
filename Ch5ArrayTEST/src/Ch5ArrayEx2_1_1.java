
public class Ch5ArrayEx2_1_1 {

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
		
//		선택정렬로 한번 만들어보기
		int[] numArr = {
				1, 5, 7, 10, 3
		};
		int[] anumArr = new int[5];
		int maxNum = 0;
		int tempNum = 0;

//			for (int i = numArr.length-1; i >= 0; i--) {
//				System.out.print(numArr[i]+"\t");
//			}
			for (int i = 0; i < numArr.length; i++) {
				for (int j = numArr.length-1; j >=1 ; j--) {
					if(numArr[j]>numArr[j-1]) {
						
						maxNum = numArr[j];
				
//					anumArr[(numArr.length-1)]= maxNum;
				}
					System.out.println(maxNum);
//				System.out.println(anumArr[i]+"\t");
			}

			}

		
		
	}
}
