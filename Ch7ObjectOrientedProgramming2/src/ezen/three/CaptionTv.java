package ezen.three;

public class CaptionTv extends Tv{ 

	boolean caption = false;
	
	void displayCaption(String text) {
		
		if(caption == true) {	// 캡션 상태가 true 이면 text를 출력한다
			System.out.println(text);
		}
		
	}
		
}
