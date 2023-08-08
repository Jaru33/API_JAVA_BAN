
public class Ch3EtcEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dNum = 3.141592;
		
		System.out.println(dNum);
		
//		소수점에서 3자리까지만 출력하라
//				or
//		소수점에서 3번째 자리를 버림 처리하고 출력하시오.
		
		double changeDoubleNum = 0.0;
		
		changeDoubleNum = (int)(dNum * 1000) / 1000.0;

		System.out.println(changeDoubleNum);
		
		
	}

}
