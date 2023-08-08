package ezen.teneight;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car();
		FireEngine fe = null;
//		Ambulance am = null;
		
		car.drive();
//		fe.water();
		
		fe = (FireEngine)car;
		fe.water();
		fe.drive();
		
//		am = (Ambulance)car;
//		am.drive();
//		am.siren();		
	}
	
}
