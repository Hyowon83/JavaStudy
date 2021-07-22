package Base;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
//		String str = "안녕";
//		if(str=="안녕") {
//			//문자열 비교는 산술비교(==)를 하면 실행되지 않는다.
//		}
//		//문자열 비교하는 방법
//		if(str.equals("안녕")) {
//			System.out.println("True");
//		}
		
//		String inital = s.nextLine();
//		//대소문자 구별없이 맞는지 체크하는 법.
//		if (inital.equalsIgnoreCase("ISU")) {
//			System.out.println("In Sang Un");
//		}
		
		"a".toUpperCase();
		"A".toLowerCase();
		"new example@naver.com".startsWith("new "); //true
		"append ".startsWith("new "); //false
		"abcccccccdefg".indexOf("c"); //2
		"[ abcd    ]".trim(); //"[abcd]"
		String[] tokens = "ABCD EFGH".split(" ");
		"ABCDEFGH".substring(2, 5);
		// ""[0:2] python문법
		
		
		
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		
		if(name.equals("JHW")) {
			System.out.println("Jang Hyowon");
		}
		s.close();
	}

}
