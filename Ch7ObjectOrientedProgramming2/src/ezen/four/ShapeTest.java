package ezen.four;

public class ShapeTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Point p = new Point();
		
		Circle c = new Circle();
		
//		p.x = 1;
//		p.y = 2;
		
		c.r = 2;
		c.point.x = 10;
		c.point.y = 20;
//		c.point = p;
		
		System.out.println("x좌표: " + c.point.x + ", y좌표: "+ c.point.y + ", 반지름: " + c.r);
	}

}
