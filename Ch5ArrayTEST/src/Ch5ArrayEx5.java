import java.util.Scanner;

public class Ch5ArrayEx5 {

	public static void main(String[] args) {
	
		
//		키보드로 짝의 나이를 입력 받는다.
//		자신의 짝의 이름을 배열에 담으시오
//		대충 3명(본인 포함)
//		각 짝의 나이를 배열에 담으시오
//		
//		모든 짝의 평균 나이를 출력하시오 
		
		Scanner sc = new Scanner(System.in);
		String[] nameArr = {"손진원", "조남용", "임찬우", "유효준"}; //34 25 28 34
		int[] ageArr= new int[4];
		int age = 0;
		double averAge = 0;
		int sum = 0;
		
		for (int i = 0; i < nameArr.length; i++) {
			System.out.print(nameArr[i]+"의 나이를 입력해주세요");
			age = sc.nextInt();
			ageArr[i]= age;
		}
		for (int i = 0; i < ageArr.length; i++) {
			System.out.println(nameArr[i]+" 나이:"+ageArr[i]);
		}
		for (int i = 0; i < ageArr.length; i++) {
			sum = sum + ageArr[i];
		}
		System.out.println(sum);
		averAge =(int)((sum/4.0+0.005)*100.0)/100.0;
		System.out.println("평균나이: "+averAge);
	}

}
