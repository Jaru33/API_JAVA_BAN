package ezen.one;

public class SilenceTv extends Tv { // TV기능 물려받기

	boolean silence = false;
	
	int beforeVolume;// 이전 볼륨의 값

	void silenceButton() {		// 음소거버튼 기능구현
		silence = !silence; 	// 버튼을 누를때 마다 음소거 상태는 변경
		if (silence == true) {	// 음소거 속성을 키거나 끈다
			beforeVolume = volume;
			volume = 0; 		// 소리를 끈다
		} else {
			volume = beforeVolume;	// 이전 볼륨으로
		}
		
	}

}
