package CodeUp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	     String money = sc.nextLine();
	     int a = Integer.parseInt(money.split(" ")[0]);
	     int b = Integer.parseInt(money.split(" ")[1]);
	     int c = Integer.parseInt(money.split(" ")[2]);
	     
	     if(c <= b) {
	    	 System.out.println(-1);
	     } else {	    	 
	    	 System.out.println((a / (c-b)) + 1);
	     }
	     
//	     if(b < c) {
//	    	 
//	    	 int i = 1;
//	    	 for(i = 1; (c * i) <= a + (b * i); i++);
//	    	 System.out.println(i);
//	    	 
//	     } else {
//	    	 System.out.println(-1);
//	     }
	     
	     sc.close();
	}
}
