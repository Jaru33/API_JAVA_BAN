
public class MyTvTest2 {

	public static void main(String[] args) {

//		하나의 Tv를 만든다
//		
//		전원은 false
//		
//		채널은 1채널
//		
//		볼륨은 10
//		
//		색상은 원하는 색의 Tv를 만드시오
//		
//		출력 형태 
//		false
//		1
//		10
//		검정색
	
		
		MyTv2 tv = new MyTv2();
		
		tv.power = false;
		tv.channel = 1;
		tv.volume = 10;
		tv.color = "검정색";
		
		System.out.println(tv.power);
		System.out.println(tv.channel);
		System.out.println(tv.volume);
		System.out.println(tv.color);
		
		
		
	}

}
