import java.util.Scanner;

public class Ch5ArrayEx6_1 {

	public static void main(String[] args) {
	
//	10, 20, 30
//	40, 50, 60
//	70, 80, 90
//	100,110,120
//	
//	출력형태
//	10
//	20
//	30
//	40
//	,
//	,
//	120
		int[][] numArr= new int[4][3];
		int sum = 0;
//		numArr[0][0] = 10;
//		numArr[0][1] = 20;
//		numArr[0][2] = 30;
//		numArr[1][0] = 40;
//		numArr[1][1] = 50;
//		numArr[1][2] = 60;
//		numArr[2][0] = 70;
//		numArr[2][1] = 80;
//		numArr[2][2] = 90;
//		numArr[3][0] = 100;
//		numArr[3][1] = 110;
//		numArr[3][2] = 120;
//		
//		System.out.println(numArr[0][0]);
//		System.out.println(numArr[0][1]);
//		System.out.println(numArr[0][2]);
//		System.out.println(numArr[1][0]);
//		System.out.println(numArr[1][1]);
//		System.out.println(numArr[1][2]);
//		System.out.println(numArr[2][0]);
//		System.out.println(numArr[2][1]);
//		System.out.println(numArr[2][2]);
//		System.out.println(numArr[3][0]);
//		System.out.println(numArr[3][1]);
//		System.out.println(numArr[3][2]);
		for (int i = 0; i < numArr.length; i++) { //numArr.length[] 첫번째갯수
			for (int j = 0; j < numArr[i].length; j++) {//numArr.length[][] 두번째갯수
				sum = sum + 10;
				numArr[i][j]= sum;
				System.out.println(numArr[i][j]);
			}
			
		}
		
	
	}

}
