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
				
				System.out.println("메뉴관리");
				menu.showMenu();
				System.out.println();

				System.out.println("메뉴작업을 선택하세요.(c: 추가/r: 목록보기/u: 수정/d: 삭제/q: 메뉴작업 종료)");
				String b = s.nextLine();
				
				while(!b.equals("q")) {
					switch(b) {
					case "c" :
						System.out.println("새 메뉴 추가");
						System.out.print("추가할 메뉴명 : ");
						String c_name = s.nextLine(); //새 메뉴명 읽기
						if(c_name.equals("")) {
							break;
						}
						menu.addName(c_name); //메뉴명 추가
						System.out.print("추가할 메뉴가격 : ");
						int c_price = s.nextInt(); //새 가격 읽기
						s.nextLine();
						menu.addPrice(c_price); //가격 추가
						break;
					case "r" :
						System.out.println("목록보기");
						menu.showMenu();
						break;
					case "u" :
						System.out.println("기존메뉴 수정");
						System.out.print("수정할 메뉴 번호 : ");
						int u_num = s.nextInt(); //수정할 메뉴번호 읽기
						s.nextLine();
						if(u_num == 0) {
							break;
						}
						System.out.print("수정할 메뉴명 : ");
						String u_name = s.nextLine(); //수정된 메뉴명 읽기
						System.out.print("수정할 메뉴가격 : ");
						int u_price = s.nextInt(); //수정된 가격 읽기
						s.nextLine();
						menu.ChangeMenu(u_num, u_name, u_price); //메뉴번호에 해당하는 메뉴명과 가격 수정하기
						break;
					case "d" :
						System.out.println("기존메뉴 삭제");
						System.out.print("삭제할 메뉴 번호 : ");
						int d_num = s.nextInt(); //삭제할 메뉴번호 읽기
						s.nextLine();
						if(d_num == 0) {
							break;
						}
						menu.DeleteMenu(d_num); //메뉴 삭제하기
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
				System.out.println("주문");
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
