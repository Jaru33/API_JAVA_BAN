
public class TimeProgramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		비객체지향적인 코드
//		절차지향
		
		int hour = 0;
		int minute = 0;
		double second = 0.0;
		int ameHour = 0;
		int ameMinute=0;
		double ameSecond = 0.0;
		int japHour = 0;
		int japMinute = 0;
		double japSecond = 0;
		
		hour = 2;
		minute = 10;
		second = 30;
		
		System.out.println("한국=> "+ "시:" + hour +" 분:"+ minute + " 초:"+ second);
		
		ameHour = 4;
		ameMinute = 20;
		ameSecond = 50;
		
		System.out.println("미국=> "+ "시:" + ameHour +" 분:"+ ameMinute + " 초:"+ ameSecond);
		
		japHour = 1;
		japMinute = 5;
		japSecond = 20;
		
		System.out.println("일본=> "+ "시:" + japHour +" 분:"+ japMinute + " 초:"+ japSecond);
		
	}

}
