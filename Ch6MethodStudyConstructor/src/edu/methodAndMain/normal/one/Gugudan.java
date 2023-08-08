package edu.methodAndMain.normal.one;

public class Gugudan {
	
	public static void main(String[] args) {
		
		String gugudanStr = "";
	       
	       for (int i = 2; i <= 9; i++) {
	            for (int j = 1; j <= 9; j++) {
	               gugudanStr = i + " * " + j + " = " + (i * j) + "\t";
	                
	               System.out.print(gugudanStr);
	            }
	            System.out.println();
	       }//구구단 end
	       
	       System.out.println();
	       int danNum = 3;
	       for (int i = 1; i <= 9; i++) {
               gugudanStr = danNum + " * " + i + " = " + (danNum * i) + "\t";
                
               System.out.print(gugudanStr);
            }
            System.out.println();
            
            System.out.println();
 	       int startDanNum = 4;
 	       int endDanNum = 6;
 	       for (int i = startDanNum; i <= endDanNum; i++) {
 	    	   for (int j = 1; j <= 9; j++) {
 	    		  gugudanStr = i + " * " + j + " = " + (i * j) + "\t";
 	    		  System.out.print(gugudanStr);
 	    	   }  
 	    	   System.out.println();
             }
             
	}	
	
}
