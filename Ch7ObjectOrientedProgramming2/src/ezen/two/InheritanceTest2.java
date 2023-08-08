package ezen.two;

public class InheritanceTest2 {
	
	public static void main(String[] args) {
		
		
		Parent p = new Parent();
		Child c = new Child();
		Child2 c2 = new Child2();
		
		GrandChild gc = new GrandChild();
		
		gc.age = 1000;
		
		System.out.println(gc.age);
		
		c.play();
//		c2.play();
		gc.play();
		
		c2.myPlay();
		c.myPlay();
		gc.myPlay();
		
		
	}
}
