package Base;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
//		final Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		
		for(int n = 2; n <= 10; n++) {
			for(int m = n; m <= n-1; m++) {
				if(n%m==0) {
					break;
				}
				System.out.println(n);
			}
		}

	}

}
