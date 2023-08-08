
public class Ch3EtcEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dNum = 3.141592;
		
//		System.out.println(dNum);
		
//		소수점에서 3자리까지만 출력하라
//				or
//		소수점에서 4번째자리 반올림하고 출력하시오.
		
		double changeDoubleNum = 0.0;
		
		changeDoubleNum = (int)((dNum+0.0005) * 1000) / 1000.0;
		System.out.println(changeDoubleNum);

		
		
		
		
//		System.out.println(Math.round(dNum*1000)/1000.0);  //Math.round = 반올림 Math.ceil = 올림 Math.floor = 버림
//		System.out.println(Math.ceil(dNum*1000)/1000.0);
//		System.out.println(Math.floor(dNum*1000)/1000.0);
//		System.out.println(Math.round(dNum*100)/100.0);

		
	}

}
