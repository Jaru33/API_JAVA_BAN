package ezen.tenthree;

public class TimeTest {

	public static void main(String[] args) {
		
		Time time = new Time();
		
		
//		time.hour = 19;
//		time.mintue = 20;
		time.timeInfo();
		
		
		Time time2 = new Time(21, 15, 30);
		time2.timeInfo();
//		time2.timeInfo2();
		
		time2.setTime(4, 4, 4);
		time2.timeInfo();
	}

}
