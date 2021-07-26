package Base;

public class ForPr {

	public static void main(String[] args) {
//		int n = 1;
//		while(n<101) {
//			System.out.println(n);
//			n++;
//		}
		
		//위의 while과 같은 결과가 나온다.
//		for(int n = 1; n < 101; n++) {
//			System.out.println(n);
//		}
		
		for(int n = 1; n <=100; n++) {
			if(n%2==1) {
				System.out.println(n);
			}
		}
		
		for(int i = 1; i <=100; i+=2) {
			System.out.println(i);
		}
	
	}
}
