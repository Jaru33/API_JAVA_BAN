
public class Ch4Flow2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		if - else if문	
//		처리해야할 경우의 수가 2개 이상인 경우에 사용한다
//		else 문
//		조건식이 전부 아닌경우 수행	
		
//		if(조건식1) {
//			조건식1의 연산결과가 참일 때 수행될 문장들
//		}else if(조건식2) {
//			조건식2의 연산결과가 참일 때 수행될 문장들
//		}else if(조건식3) {
//			조건식3의 연산결과가 참일 때 수행될 문장들
//		}else if(조건식4) {
//			조건식4의 연산결과가 참일 때 수행될 문장들
//		}else{
//			위의 조건식이 전부 아닐 경우 수행될 문장들을 적는다.
//		}
	
		
		int age = 0;
		
		age =9;
		
//		if(age >= 10 && age < 20) {
//			System.out.println("10대 입니다");
//		}else if(age >= 20 && age < 30) {
//			System.out.println("20대 입니다");
//		}else if(age >= 30 && age < 40) {
//			System.out.println("30대 입니다");
//		}
//		System.out.println("프로그램이 종료됩니다");	
		
		
		if(age >= 20) {
			System.out.println("성인입니다");
		}else if(age >= 10 && age <= 19){
			System.out.println("청소년입니다");
		}else {
			System.out.println("아동입니다");
		}
		System.out.println("프로그램이 종료됩니다");
	}
}
