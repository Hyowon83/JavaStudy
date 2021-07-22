package Base;

import java.util.Scanner;

public class ScannerPr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.next(); // 공백포함X
		s.nextLine(); // 공백포함O
		//int n = s.nextInt(); //다른타입으로 읽어들일수도 있다.
		//float f = s.nextFloat();
		
		//하지만 문자로 읽어들여서 변환해주는 방법이 제일 유연하다.
		//int n = Integer.parseInt(str); 이런식으로.(중요함)
		//float f = Double.parseDouble(str);
		
		System.out.println("Hello "+str+"!!!");

	}

}
