package one;

public class Cat implements Animal {
	String eatSound = "";
	String mouth = "";
	int leg = 0;
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("고양이는 "+leg+"발로 걷는다");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("고양이는 "+leg+"발로 달린다");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("고양이는 "+mouth +"(으)로 "+ eatSound + " 먹는다");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("고양이는 잠을 잔다");
	}

}
