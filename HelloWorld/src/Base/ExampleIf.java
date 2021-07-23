package Base;

import java.util.Scanner;

public class ExampleIf {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int a = Integer.parseInt(str);
		
		if(a>89) {
			System.out.println("A");
		} else if(a>79) {
			System.out.println("B");
		} else if(a>69) {
			System.out.println("C");
		} else if(a>59) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}
}

