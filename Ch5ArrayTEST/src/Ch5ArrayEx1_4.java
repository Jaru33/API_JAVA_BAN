
public class Ch5ArrayEx1_4 {

	public static void main(String[] args) {
	
//		총점과 평균을 구하자
		
//		국영수 3개의 점수의 총점과 평균구하기
//		평균은 소수점 3번째에서 올림한다
//		
//		출력형태
//		총점: ???
//		평균: ???
		
		int korScore = 80;
		int mathScore = 78;
		int engScore = 69;
		
		int score = 0;
		double averScore = 0;
		
		score = (korScore+mathScore+engScore);
		averScore = (int)((score/3)*100.0+1)/100.0;
		
		System.out.println("총점: "+score);
		System.out.println("평균: "+averScore);
		
		
//		int[] score = {80, 88, 90};
//		int korScore = 0;
//		int engScore = 0;
//		int mathScore = 0;
//		int sumScore = 0;
//		double averScore = 0;
//		
//		for (int i = 0; i < 3; i++) {
//			korScore = score[i];
//			i++;
//			engScore = score[i];
//			i++;
//			mathScore = score[i];
//			i++;
//			System.out.println(korScore);
//			sumScore = korScore+engScore+mathScore;
//			averScore= (int)((sumScore/3+0.009)*100.0)/100.0;
//		}
//		
//		System.out.println("총합: "+sumScore);
//		System.out.println("평균: "+averScore);
		
	}

}
