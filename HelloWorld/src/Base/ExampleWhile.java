package Base;

import java.util.Scanner;

public class ExampleWhile01 {

	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		while(true) {
//			String a = s.nextLine();
//			if(a.equals("x")) {
//				System.out.println("프로그램 종료");
//				s.close();
//				return;
//			} else if(a.equals("m")) {
//				System.out.println("메뉴 리스트");
//			} else if(a.equals("o")) {
//				System.out.println("주문");
//			} else if(a.equals("s")) {
//				System.out.println("매출현황");
//			} else {
//				System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
//			}
//			
//		}
		
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		do {
			if(a.equals("m")) {
				System.out.println("메뉴 리스트");
			} else if(a.equals("o")) {
				System.out.println("주문");
			} else if(a.equals("s")) {
				System.out.println("매출현황");
			} else {
				System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
			}
			a = s.nextLine();
		} while(!a.equals("x"));
		System.out.println("프로그램 종료");
		s.close();

	}

}
