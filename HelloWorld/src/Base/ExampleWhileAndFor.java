package Base;

public class ExampleWhileAndFor {

	public static void main(String[] args) {
//		int a = 2;
//		while(a<=9) {
//			int b = 1;
//			while(b<=9) {
//				System.out.printf("%d x %d = %2d\n", a, b, a*b);
//				b++;
//			}
//			System.out.println();
//			a++;
//		}
		
		for(int n=2;n<=9;n++) {
			for(int m=1;m<=9;m++) {
				System.out.printf("%d x %d = %2d\n", n, m, n*m);
			}
			System.out.println();
		}
		
	}
}
