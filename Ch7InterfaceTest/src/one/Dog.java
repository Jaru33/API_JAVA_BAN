package one;

public class Dog implements Animal, Sociability{
	
// 다리가 있다
//	입이있다
	String eatSound = "";
	String mouth = "";
	int leg = 0;
//	4발로 걷는다
//	4발로 달린다
//	입으로 먹는다
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("강아지는 "+leg+"발로 걷는다");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("강아지는 "+leg+"발로 달린다");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
			
		System.out.println("강아지는 "+mouth +"(으)로 "+ eatSound +" 먹는다");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("강아지는 잠을 잔다");
	}

	@Override
	public void kind() {
		// TODO Auto-generated method stub
		System.out.println("시회성?");
	}

	
	
	
}
