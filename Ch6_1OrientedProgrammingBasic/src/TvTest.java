
public class TvTest {
	
	public static void main(String[] args) {
		
		Tv tv;
//		클래스 -> 인스턴스화 -> 인스턴스(객체)
		tv = new Tv(); //new 객체(instance) 주소할당
		
		tv.channel = 7;
		tv.channelDown();
		
//		System.out.println("현재 채널은 "+ tv.channel +" 입니다");
		
		//tv 전원 킨다
		tv.power();
		System.out.println(tv.power);
		
		//tv 채널을 1로 설정한다
		tv.channel = 1;
		
		//tv 채널을 5번까지 올린다
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		System.out.println("현재 채널은 "+ tv.channel +" 입니다");
	}

}
