package Base;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// Factorial : n!
		// 4! = 4x3x2x1
		// 10! = 10x9x8x7x6x5x4x3x2x1
		
		final Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1;
		for(int n = 1; n <= a; n++) {
			b *= n;
		}
		System.out.printf("%d! = %d", a, b);
		sc.close();
	}
}
