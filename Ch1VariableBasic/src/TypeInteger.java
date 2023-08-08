
public class TypeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		정수형
//		byte	<	short	<	int		<	long
//		크기(size)
//		1			2			4			8
		
//		단위
//		bit
		
//		2의 8승 ->256 /2 -> -128 ~ +127
//		저장 가능한 값의 범위
		
		byte byteValue = (byte)-130;
		int intValue = 100;
		long longValue = 1000;

		
		System.out.println("byteValue:\t"+ byteValue);
		System.out.println("intValue:\t"+ intValue);
		System.out.println("longValue:\t"+ longValue);
		
//		byteValue = intValue;
//		byteValue = 100;
//		long의 허용 단위 (몇조? 몇경?900)
		
		System.out.println("byteValue:"+ byteValue);
		System.out.println("intValue:"+ intValue);
		
		
		
		
	}

}
