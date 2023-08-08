
public class Ch5ArrayEx4 {

	public static void main(String[] args) {
	
		int[] numArr = {
				3, 5, 1, 10, 7
		};
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "\t");
		}
		int tempNum = 0;
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr.length-1; j++) {
				if(numArr[j] < numArr[j+1]) {
					tempNum = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tempNum;
				}
			}
		} // 첫번째 for end
		System.out.println();
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i]+"\t");
		}
	}

}
