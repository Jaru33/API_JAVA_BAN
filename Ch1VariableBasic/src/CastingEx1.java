
public class CastingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		형변환(Casting, 캐스팅) 이란?
//				
//		형변환이란, 변수 또는 상수의 타입을 다른 타입으로 변환하는 것
//		
//		방법
//		(타입)피연산자
		
//		묵시적:
//		눈에는 보이지 않지만 어딘가에서 처리되고 있음 => 자동
//		
//		명시적:
//		눈에 보임, 명확하게 표시함 => 수동
		
//		명시적 형변환, 자동 형변환
		
		double d = 85.8;
		long bigNum = 3000000000L;
		int score = 0;
		
		
//		score = d;
//		score = bigNum;
//		bigNum = (long)score;
		System.out.println(score);
		
		score = (int)d;
//		score = (int)bigNum;
		System.out.println(d);
		System.out.println(score);
		
	}

}
