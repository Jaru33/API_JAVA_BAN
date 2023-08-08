
public class Ch3OperatorEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		논리연산자
//		
//		||(or연산자): 피연산자 중 어느 한쪽만 true이면 true를 결과로 얻는다    |는 피연산자 둘다 판별함
//		&&(and연산자): 피연산자 양쪽 모두 true이어야 true를 결과로 얻는다      &는 피연산자 둘다 판별함
		
//		int x =10;
//		int y = 3;
//		
//		System.out.println(x==y&& x!=y);
//		System.out.println(x!=y&&x>y);
//		System.out.println(x>y||x<y);
//		System.out.println(x<y||x==y);
		
//		System.out.println(10 <= x < 20);  true<20  삐삐 X
//		System.out.println(10<=x && x<20);
		int num =5;
		int n =150;
		
		System.out.println("5는0보다 크고, 9보다 작은가?");  
		System.out.println(num > 0 && num < 9); // true and true  => true
		System.out.println("n은 0보다 작거나 100보다 큰가?");
		System.out.println( n < 0 || n > 100);
		//                false or true   => true
	}

}
