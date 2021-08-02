package coffeeShop;
import java.util.Scanner;

//import java.util.Scanner;

public class CoffeeShop {

	public static void main(String[] args) {
		Menu menu = new Menu();
		//menu.showMenu();
		
		// m: 메뉴관리
		// o: 주문받기
		// s: 실적보기
		// x: 프로그램 종료.
		Scanner s = new Scanner(System.in);
		while(true) {
			String a = s.nextLine();
			if(a.equals("x")) {
				System.out.println("프로그램 종료");
				s.close();
				return;
			} else if(a.equals("m")) {
				System.out.println("m");
			} else if(a.equals("o")) {
				System.out.println("o");
			} else if(a.equals("s")) {
				System.out.println("s");
			} else {
				System.out.println("해당사항 없음.");
			}
			
		}
		
//		menu.load();
//		Scanner s1 = new Scanner(System.in);
//		Scanner s2 = new Scanner(System.in);
//		
//		System.out.println("메뉴명 입력:");
//		String name=s1.nextLine();
//		while(!name.equals("")) { //빈 문자열 입력.
//			System.out.println("가격입력:");
//			int price = s2.nextInt();
//			menu.addName(name);
//			menu.addPrice(price);
//			System.out.println("메뉴명 입력:");
//			name=s1.nextLine();
//		}
//		System.out.println("메뉴목록");
//		s1.close(); s2.close();
	}

}
