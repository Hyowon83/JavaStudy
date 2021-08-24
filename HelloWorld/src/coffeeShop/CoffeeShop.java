package coffeeShop;
import java.util.Scanner;

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
			
			System.out.println("작업을 선택하세요.(m: 메뉴관리/s: 실적조회/o: 주문/x: 프로그램 종료)");
			String a = s.nextLine();
			if(a.equals("x")) {
				System.out.println("프로그램 종료");
				s.close();
				return;
			} else if(a.equals("m")) {
				System.out.println("메뉴관리가 제대로 뜬다.");
				System.out.println("메뉴관리");
				menu.showMenu();
				System.out.println();

				System.out.println("메뉴작업을 선택하세요.(c: 추가/r: 목록보기/u: 수정/d: 삭제/q: 메뉴작업 종료)");
				String b = s.nextLine();
				
				while(!b.equals("q")) {
					switch(b) {
					case "c" :
						System.out.println("스위치 코드 잘 짜여졌나?");
						menu.appendMenu();
						break;
					case "r" :
						System.out.println("목록보기");
						menu.showMenu();
						break;
					case "u" :
						menu.changeMenu();
						break;
					case "d" :
						menu.deleteMenu();
						break;
					}
					menu.save();
					System.out.println();
					System.out.println("메뉴작업을 선택하세요.(c: 추가/r: 목록보기/u: 수정/d: 삭제/q: 메뉴작업 종료)");
					b = s.nextLine();
				}
				
//				do {
//					//CRUD(추가/수정/삭제)
//					System.out.println("메뉴작업을 선택하세요.(c: 추가/r: 목록보기/u: 수정/d: 삭제/q: 메뉴작업 종료)");
//					b = s.nextLine(); //값을 읽는다. //새 값을 읽는다.
//					
//					if(b.equals("c")) { //"c" 새 메뉴 추가 작업
//						System.out.println("새 메뉴 추가");
//					} else if(b.equals("r")) { //"r" 목록보기
//						System.out.println("목록보기");
//					} else if(b.equals("u")) { //"u" 기존메뉴 수정(이름/가격)
//						System.out.println("기존메뉴 수정");
//					} else if(b.equals("d")) { //"d" 기존메뉴 삭제
//						System.out.println("기존메뉴 삭제");
//					} else if(!b.equals("q")) {
//						System.out.println("해당사항 없음.");
//					}
//					
//				} while(!b.equals("q")); //"q"가 아닌동안
				
				System.out.println("메뉴작업 종료");
				
			} else if(a.equals("o")) {
				
				Order order = new Order();
				menu.showMenu();
				System.out.print("번호 뒷자리를 입력하세요. : ");//"모바일 번호를 입력하세요" 출력
				String mobile = s.nextLine(); //주문고객의 모바일 번호 입력 받음.
				System.out.print("메뉴 번호를 입력해주세요. : ");// "메뉴번호 입력" 출력
				String o_num = s.nextLine();
				while(!o_num.equals("")) { // 메뉴번호가 ""이 아닌동안 값을 받는다.
					order.addMobile(mobile);
					menu.getName(o_num);
					menu.getPrice(o_num);
					System.out.print("수량을 입력해주세요. : ");//출력 "수량을 입력하세요"
					int o_cnt = s.nextInt();
					System.out.println();
					s.nextLine();
					
					System.out.printf("모바일번호 : %s\n", mobile);
					order.addOrder(menu.getName(o_num), menu.getPrice(o_num), o_cnt);
					
					menu.showMenu();
					System.out.print("메뉴 번호를 입력해주세요. : ");
					o_num = s.nextLine();
				}
				System.out.println("주문이 종료되었습니다.");
				System.out.println();
				
				order.totalMenu();
				System.out.println("모든 주문메뉴의 총액 : " + order.getTotalSum()); // 각 메뉴의 총액을 더한 전체 총액을 출력
				System.out.println();
				
				// 실적에 추가한다(나중에)
			} else if(a.equals("s")) {
				System.out.println("실적조회");
			} else {
				System.out.println("해당사항 없음.");
			}
			System.out.println();
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
