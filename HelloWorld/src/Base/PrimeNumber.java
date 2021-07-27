package Base;

//import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
//		final Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
		

		for(int n = 2; n <= 10000; n++) {
			int flag = 1;
			for(int m = 2; m < n; m++) {
				if(n%m==0) {
					flag = 0;
					break;
				}
			}
			if(flag == 1) {				
				System.out.println(n);
			}
		}

	}

}
