package one;

public class Rabbit implements Animal{
//강아지는 멍멍 짖는다
//다리가 있다
// 입이 있다
	
//토끼는
//4발로 걷는다
//4발로 달린다
//토끼는 냠냠
	String eatSound = "";
	String mouth = "";
	int leg = 0;
	@Override
	public void work() {
	// TODO Auto-generated method stub
		System.out.println("토끼는 "+leg+"발로 걷는다");
	}
	@Override
	public void run() {
	// TODO Auto-generated method stub
		System.out.println("토끼는 "+leg+"발로 달린다");
	}
	@Override
	public void eat() {
	// TODO Auto-generated method stub
		System.out.println("토끼는 "+mouth +"(으)로 "+ eatSound + " 먹는다");
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("토끼는 잠을 잔다");
	} 
}
