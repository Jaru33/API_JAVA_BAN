
public class Ch4Flow4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		스위치문(switch)
		
//		if문과 비슷
//		
//		switch (조건식) {
//		case value1:
//			조건식의 결과가 값1과 같은 경우 수행될 문장들
//			break;
//		case value2:
//			조건식의 결과가 값2과 같은 경우 수행될 문장들			
//			break;
//		case value3:
//			조건식의 결과가 값3과 같은 경우 수행될 문장들			
//			break;
//			.
//			.
//			.
//			.
//		default:
//			조건식의 결과와 일치하는 case 문이 없을 때 수행될 문장들
//			break;
//		}
		int levelNum = 0;
		String str = "";
		
		levelNum = 2;
		
		switch (levelNum) {
		case 1:
			str = "신입";
			break;
		case 2:
			str = "사원";
			break;
		default:
			str = "경력사원";
			break;
		}
		
		System.out.println(str);
	}

}
