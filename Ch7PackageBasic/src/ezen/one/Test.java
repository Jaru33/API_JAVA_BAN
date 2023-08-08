package ezen.one;

public class Test {

	public static void main(String[] args) {
//		구구단만들기 2차원배열로
		
		int[][] num = new int [8][9];
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j]=(i+2)*(j+1);
				System.out.print((i+2)+" X "+(j+1)+" = "+num[i][j]+"\t");
			}
			System.out.println();
		}
			
		
	}

}
