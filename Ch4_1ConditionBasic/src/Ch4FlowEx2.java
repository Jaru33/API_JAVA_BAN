
public class Ch4FlowEx2 {

	public static void main(String[] args) {

//		클래스명
//		성적처리 프로그램
//
//		90 ~ 100이면 A등급
//		80 ~ 89이면 B등급
//		70 ~ 79이면 C등급
//		나머지 점수는 F등급
//
//		으로 출력하는 프로그램
		
		int score = 0;

		score = 70;

		System.out.println(score);
		
		if(score>=90 && score <= 100) {
			System.out.println("A등급입니다.");
		}else if(score>=80 && score <= 89) {
			System.out.println("B등급입니다.");
		}else if(score>=70 && score <= 79) {
			System.out.println("C등급입니다.");
		}else if(score <=69){
			System.out.println("F등급입니다.");
		}
//		if(score>=90 && score <= 100) {                  가장깔끔함.
//			System.out.println("A등급입니다.");
//		}else if(score>=80 ) {
//			System.out.println("B등급입니다.");
//		}else if(score>=70 ) {
//			System.out.println("C등급입니다.");
//		}else if(score <=69){
//			System.out.println("F등급입니다.");
//		}
		

	}

}
