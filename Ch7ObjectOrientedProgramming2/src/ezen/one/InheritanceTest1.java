package ezen.one;

public class InheritanceTest1 {
	
	public static void main(String[] args) {
		
		
		Parent p = new Parent();
		
		Child c = new Child();
		
		p.age = 10;
//		p.play();
		
		System.out.println(p.age);
		
		c.age = 100;
		c.play();
		
		System.out.println(c.age);
		System.out.println(p.age + c.age);
		
	}
}
