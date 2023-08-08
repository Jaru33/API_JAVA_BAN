package four;

public class ShoppingMallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buyer buyer1 = new Buyer("손진원",2000);
		Buyer buyer2 = new Buyer("조남용",500);
		Buyer buyer3 = new Buyer("임찬우",20);
		Com com = new Com();
		Book book = new Book();
		Tv tv = new Tv();
		
	
		buyer1.buy(tv);
		System.out.println();
		System.out.println("고객이름: "+ buyer1.BuyerName);
		System.out.println("현재 남은 돈은 " + buyer1.money + "원입니다");
		System.out.println("현재 보너스 점수는 "
				+ buyer1.bonusPoint + "점입니다");
		System.out.println();
		
	
		buyer2.buy(com);
		System.out.println();
		System.out.println("고객이름: "+ buyer2.BuyerName);
		System.out.println("현재 남은 돈은 " + buyer2.money + "원입니다");
		System.out.println("현재 보너스 점수는 "
				+ buyer1.bonusPoint + "점입니다");
		
		System.out.println();
		
		
		buyer3.buy(book);
		System.out.println();
		System.out.println("고객이름: "+ buyer3.BuyerName);
		System.out.println("현재 남은 돈은 " + buyer3.money + "원입니다");
		System.out.println("현재 보너스 점수는 "
				+ buyer3.bonusPoint + "점입니다");
		
		System.out.println();
		
		
		
		
	}

}
