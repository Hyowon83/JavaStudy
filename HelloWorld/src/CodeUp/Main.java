package CodeUp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < n - i; j++){
				System.out.print(" "); 
			}
			for(int j = 0; j < 2 * i + 1; j++){
				System.out.print("*"); 
			}
			System.out.println();
		}
		
		sc.close();

//		// 백의자리 십의자리 일의자리 구하기
//		int a = 653;
//		System.out.printf("백의자리 : %d\n",a/100);
//		System.out.printf("십의자리 : %d\n",(a%100)/10);
//		System.out.printf("일의자리 : %d\n",a%10);
	}
}
