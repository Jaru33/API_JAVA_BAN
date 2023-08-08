
public class CardTest {

	public static void main(String[] args) {
//      2개의 카드를 만든다
//      
//      하나는 이젠아카데미 교육용 카드
//      
//      하나는 자신이 임의로 만든 카드명 짓는다
//      
//      제조사는 본인이 생각한 이름으로 지정한다
//      나머지 값은 자유
//      
//      출력형태
//      카드1 크기, 높이, 모양숫자
//      카드명
//      제조사명
//      
//      카드2 크기, 높이, 모양숫자
//      카드명
//      제조사명
 
      Card c1 = new Card();
       c1.name = "이젠아카데미(교육용)";
       c1.num = 3;
       c1.kind = "spade";
      Card c2 = new Card();
       c2.name = "진원카드";
       c2.num = 4;
       c2.kind = "hart";
       
       
       System.out.println("카드1 "+Card.height+" "+Card.width+" "+c1.kind+c1.num);
       System.out.println(c1.name);
       System.out.println(Card.company);
       System.out.println();
       
       System.out.println("카드2 "+Card.height+" "+Card.width+" "+c2.kind+c2.num);
       System.out.println(c2.name);
       System.out.println(Card.company);
      
	}

}
