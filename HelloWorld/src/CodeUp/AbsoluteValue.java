package CodeUp;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		// 두 수의 차이가 얼마나 나는지 구하기(절대값)
		
		Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long m = sc.nextLong();
        
        long res;
        
        res = Math.abs(n-m); //절대값 구하는 함수
        
        System.out.println(res);
        sc.close();
        
        // 원시인 버전
//		 Scanner sc=new Scanner(System.in);
//	     String point = sc.nextLine();
//	     long a = Long.parseLong(point.split(" ")[0]);
//	     long b = Long.parseLong(point.split(" ")[1]);
//	     long more_small = 0;
//	     long more_big = 0;
//	     
//	     if(a < 0 || a < b) {
//	    	 more_small = -a;
//	    	 more_big = b;
//	     } else if(b < 0 || b < a){
//	    	 more_small = -b;
//	    	 more_big = a;
//	     }
//	     
//	     if(more_big + more_small < 0) {
//	    	 System.out.println(-(more_big + more_small));	    	 
//	     } else {
//	    	 System.out.println(more_big + more_small);
//	     }
//	     
//	     sc.close();
	}

}
