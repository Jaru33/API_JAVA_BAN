
public class Tv3 {
	
	// Tv의 속성(맴버변수)
	String color = "";
	boolean power = false;
	int channel = 0;
	
	
	//Tv의 기능(메서드)
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	void channelDown(){
		channel--;
		
	}
	
	public static void main(String[] args) {
		
		
	}

}
