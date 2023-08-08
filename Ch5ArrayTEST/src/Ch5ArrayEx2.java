
public class Ch5ArrayEx2 {

	public static void main(String[] args) {

//		섞는다라는 개념?
		
		int[] ballArr = new int[45];
		
		for (int i = 0; i < ballArr.length; i++) {
			ballArr[i] = i+1;
		}
		int tempNum = 0;
		int randNum = 0;
//		섞기 서로 교환을위해 새로운변수 추가
		
		for (int i = 0; i < 6; i++) {
			randNum = (int)(Math.random()*45);
			tempNum = ballArr[i];
			ballArr[i] = ballArr[randNum];
			ballArr[randNum]= tempNum;  //자리바꿈 교체로직 
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(ballArr[i] +"\t");
			
		}
	}

}
