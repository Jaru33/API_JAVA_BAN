
public class Ch5ArrayEx6_5T {

	public static void main(String[] args) {
	
//   우리반에서 아는 사람 이름 3개를
//   다른 배열에 복제하고 마지막 사람의 이름을
//   본인이름으로 변경하여 서로 다르게 값을 가질수 
//   있음을 증명하시오
		
//	출력형태
//	원본 이름
//	??? ??? ???
//			
//	복제된 이름
//	??? ??? ___
		String[] nameArr = {"조남용", "임찬우", "유효준"};
		String[] copyNameArr = new String[3];

		for (int i = 0; i < copyNameArr.length; i++) {
			copyNameArr[i]=nameArr[i];
		}
 
		copyNameArr[2] ="손진원";
		
		System.out.println("원본 이름");
		for (int i = 0; i < copyNameArr.length; i++) {
			System.out.print(nameArr[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("복제된 이름");
		for (int i = 0; i < copyNameArr.length; i++) {
			System.out.print(copyNameArr[i]+" ");
		}
	}
}
