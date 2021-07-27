package Base;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// 최대공약수와 최소공배수 구하기
		final Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		int d = 0;
		
		if(a<b) {
			for(c = 2; c <= a; c++) {
				if(a%c == 0 && b%c == 0) {
					d = c;
				}
			}
		} else if(b<a) {
			for(c = 2; c <= b; c++) {
				if(a%c == 0 && b%c == 0) {
					d = c;
				}
			}
		}
//		for(c = 2; c<=a || c<=b; c++) {
//			if(a%c == 0 && b%c == 0) {
//				d = c;
//			}
//		}
		System.out.printf("%d, %d의 최대공약수 : %d\n", a, b, d);
		System.out.printf("%d, %d의 최소공배수 : %d\n", a, b, a*b/d);
		sc.close();
		
		int n = 0;
		for(int m = 1; m <= 100; m++) {
			n += m;
		}
		System.out.printf("1부터 100까지의 합 : %d", n);
	}

}
