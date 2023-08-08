
public class TimeTest {
	
	public static void main(String[] args) {
//		객체지향적인 코드
//		객체지향
		
		Time koreaTime = new Time();
		Time americaTime = new Time();
		Time ukTime = new Time();
		
//		koreaTime.hour = 2;
//		koreaTime.minute = 10;
//		koreaTime.second = 30;
		
		koreaTime.setHour(23);
		koreaTime.setMinute(10);
		koreaTime.setSecond(30);
		
		System.out.println("korea시:" + koreaTime.getHour() 
				+" korea분:"+ koreaTime.getMinute() 
				+ " korea초:"+ koreaTime.getSecond());
		
		americaTime.setHour(11);
		americaTime.setMinute(20);
		americaTime.setSecond(40);
		
		System.out.println("america시:" + americaTime.getHour() 
				+" america분:"+ americaTime.getMinute() 
				+ " america초:"+ americaTime.getSecond());
		
		ukTime.setHour(12);
		ukTime.setMinute(13);
		ukTime.setSecond(41);
		
		System.out.println("uk시:" + ukTime.getHour() 
				+" uk분:"+ ukTime.getMinute() 
				+ " uk초:"+ ukTime.getSecond());
		
	}

}
