
public class Ch3OperatorEx4 {

	public static void main(String[] args) {
		
//	나머지 연산자% -> 매우 유용하다
//	% 연산자	
//	왼쪽의 값을 오른쪽 값으로 나누고 난 나머지 값을 결과로 반환하는 연산자	
		int x = 10;
		int y = 3;
		
		int resultNum= 0;
		
		resultNum = x/y;
		System.out.println("몫: "+ resultNum);
		
		resultNum = x%y;
		System.out.println("나머지: "+ resultNum);
	}

}
