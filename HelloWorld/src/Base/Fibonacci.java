package Base;

public class Fibonacci {

	public static void main(String[] args) {
		
//		int a = 0;
//		int b = 1;
//		int c = 0;
//		
//		for (a = 0; a < 10000; a++) {
//			if(c<10000) {
//				System.out.println(c);
//				a = b;
//				b = c;
//				c = a + b;				
//			}
//		}
		
		int n = 0;
		int m = 1;
		for(int z = 0; z <= 10000; z = n + m) {
			System.out.println(z);
			n = m;
			m = z;
		}
	}
}
