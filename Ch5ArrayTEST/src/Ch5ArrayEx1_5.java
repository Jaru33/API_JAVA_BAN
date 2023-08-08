
public class Ch5ArrayEx1_5 {

	public static void main(String[] args) {
	
//		최대값과 최소값 구하기
		
//		79, 88, 91, 33이라는 숫자가 존재한다
//		
//		이들 중에 최대값, 최소값을 구하라
//		
//		출력형태
//		
//		최대값: 91
//		최소값: 33
		
		int[] num = {79, 88, 91, 33};
		int maxNum = 0;
		int minNum = 0;
			
		for (int i = 0; i < 3; i++) {
			if(num[i]>num[i+1]) {
				maxNum = num[i];
				minNum = num[i+1];
			}else {
				maxNum = num[i+1];
				minNum = num[i];
			}
			
		}
		System.out.println("최대값: "+ maxNum);
		System.out.println("최소값: "+ minNum);
	}

}
