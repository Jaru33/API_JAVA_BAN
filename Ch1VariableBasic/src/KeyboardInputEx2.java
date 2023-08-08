import java.util.Scanner;

public class KeyboardInputEx2 {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      
      int num1 = 0;
      int num2 = 0;
      long num3 = 0;
      
      System.out.println("사용자님 첫번째 숫자를 입력해주세요. : ");
      num1 = scan.nextInt();
      
      System.out.println("사용자님 곱할 숫자를 입력해주세요. : ");
      num2 = scan.nextInt();
      System.out.println("");
      
//      num3 = (long)(num1*num2);  (long)(int*int) ->인트값으로먼저계산되어 롱으로
      num3 = (long)num1*(long)num2; //(long)*(long) -> 롱 롱으로 변경되어 계산
      
      System.out.println("결과 : " + num3 +"\n");
      System.out.print("프로그램을 종료합니다.");
      
   }

}