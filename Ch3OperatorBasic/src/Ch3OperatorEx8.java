
public class Ch3OperatorEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		조건 연산자
//		삼항 연산자		(중첩 삼항 연산자 알아보기)
//		조건식 ? 식1 :		:	식2:
//				참인경우		거짓인 경우
				
		int sexCheck = 0;
		String resultStr = "";

		sexCheck = 9;
		
	resultStr = (sexCheck ==1) ? "남자" : "여자";
//		resultStr = (sexCheck ==1) ? "남자" : (sexCheck ==2) ? "거인":(sexCheck ==3) ?  "난장이":"여자"; //중첩삼항연산자
		
		System.out.println(resultStr + " 입니다");
		
		
		
		
	}

}
