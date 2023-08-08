
public class Ch5ArrayEx6_3 {

	public static void main(String[] args) {

//		2차원 배열을 공부해보자

//		1 2 3
//		8 9 4
//		7 6 5
		int num = 0;
		int[][] numArr = new int[3][3];

		for (int j = 0; j < numArr.length; j++) {// 첫번째 for
			num = num + 1;
			numArr[0][j] = num;
			if (j == 2) {// 1번째 if
				for (int j2 = 1; j2 < numArr.length; j2++) {// 2번째 for
					num = num + 1;
					numArr[j2][j] = num;
					if (j2 == 2) { // 2번째 if
						for (int k = 1; k >= 0; k--) {// 3번째 for
							num = num + 1;
							numArr[j2][k] = num;
							if (k == 0) {// 3번째 if
								for (int k2 = 1; k2 > 0; k2--) {// 4번째 for
									num = num + 1;
									numArr[k2][k] = num;
									if (k2 == 1) {// 4번째 if
										num = num + 1;
										numArr[k2][1] = num;
									} // 4번째 if
								} // 4번째 for
							} // 3번째 if
						} // 3번째 for
					} // 2번째 if 끝
				} // 2번째 for 끝
			} // 1번째 if끝

		} // 첫번째 for문 끝

		for (int i = 0; i < numArr.length; i++) {

			for (int j = 0; j < numArr.length; j++) {
				System.out.print(numArr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
