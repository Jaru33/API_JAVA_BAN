

public class Ch4Etc1 {

	public static void main(String[] args) {
		
		int com = 0;
		
		double num = 0;
		
		num = Math.random();  // random 은 double이다.
		
		System.out.println(num);
		
		com = (int)(Math.random()*3) + 1;
//			형변화(정수화)          범위 시작위치
		System.out.println("Com은" + com + "입니다.");
	}

}
