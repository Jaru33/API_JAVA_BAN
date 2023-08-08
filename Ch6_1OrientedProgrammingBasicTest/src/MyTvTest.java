
public class MyTvTest {

	public static void main(String[] args) {

//		Tv를 2개 생성한다
//		
//		하나는 채널을 원하는 숫자로 변경한다
//		
//		하나는 볼륨을 원하는 숫자로 변경한다
//		
//		출력형태
//		1번 Tv
//		채널: ??
//		볼륨: ??
//		2번 Tv
		MyTv tv = new MyTv();
		MyTv tv2 = new MyTv();
		
		tv.channel = 7;
		
		tv2.volume = 11;
		
		System.out.println("1번 Tv");
		System.out.println("채널: "+tv.channel);
		System.out.println("볼륨: "+tv.volume);
		System.out.println();
		System.out.println("2번 Tv");
		System.out.println("채널: "+tv2.channel);
		System.out.println("볼륨: "+tv2.volume);
		
		
		
	}

}
