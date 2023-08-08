public class Ch4FlowEx2_1 {

	public static void main(String[] args) {

//		클래스명
//		성적처리 프로그램
//
//		90이상이면 A등급
//		80이상이면 B등급
//		70 이상이면 C등급
//		나머지 점수는 F등급
//
//      출력 ex
//      94
//      A등급입니다
//      아니면 
//      82
//      B등급입니다
//      70
//      C등급입니다
//      60
//      F등급입니다
		
		int score = 0;
		String str = "";
		
		
		score = 60;
		
		System.out.println(score);
			
		if(score >=90) {
			str = "A등급";
		}else if(score >=80){
			str = "B등급";
		}else if(score >= 70) {
			str = "C등급";
		}else if(score >=60){
			str = "D등급";
		}else {
			str = "F등급";
		}
		System.out.println(str+" 입니다.");
		
		

		
				
		

	}

}
