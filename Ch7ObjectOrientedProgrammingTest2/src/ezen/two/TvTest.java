package ezen.two;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv = new Tv();
		SilenceTv sTv = new SilenceTv();

		for (int i = 0; i < 7; i++) {
			sTv.volumeUp();
		}

		System.out.println("볼륨 업 " + sTv.volume);

		sTv.silenceButton();

		System.out.println("음소거 " + sTv.volume);

		sTv.silenceButton();
		System.out.println("음소거 끔 " + sTv.volume);

		String result = "";

		result = tv.buttonInfo();
		System.out.println(result);

		result = sTv.buttonInfo();
		System.out.println(result);
	}

}
