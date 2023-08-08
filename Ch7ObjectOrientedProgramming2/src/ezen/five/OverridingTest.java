package ezen.five;

public class OverridingTest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		String resultStr = "";
		
		resultStr = p.getLocation();
		System.out.println(resultStr);
		
		Point3D p3d = new Point3D();
		
		resultStr = p3d.getLocation();
		System.out.println(resultStr);
	}

}
