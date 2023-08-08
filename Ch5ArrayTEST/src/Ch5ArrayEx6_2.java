
public class Ch5ArrayEx6_2 {

	public static void main(String[] args) {
	
//		2차원 배열을 공부해보자
		
//		10 100 1000 10000 100000
//		20 20 20 20 20
//		30 30 30 30 30
//		40 40 40 40 40
		int[] xArr = new int [4];
		int[] yArr = new int [5];
		int[][] numArr = new int[4][5];
		int num = 0;
		int aNum = 1;
		
		//입력
		for (int i = 0; i < xArr.length; i++) {//xArr = numArr
			num = num+1;
			xArr[i] = xArr[i] + num;
		}
		
		for (int i = 0; i < yArr.length; i++) {//yArr = numArr[i]
			aNum = aNum*10;
			yArr[i] = aNum;
		}
		
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				numArr[i][j] = xArr[i]*yArr[j];
			}	
		}
		
		//출력
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				System.out.print(numArr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
