

public class Ch4EtcEx1 {

	public static void main(String[] args) {
		
		int com = 0;
//			ex) 95~100 표현
//			com = (int)(Math.random() * 6 ) + 95;
//			형변화(정수화)                 범위   시작위치
//			주사위 만들기 1~6표현
			com = (int)(Math.random() * 6 ) + 1;
//			형변화 (정수화)                 범위   시작위치
			
		System.out.println("Com은" + com + "입니다.");
	}

}
