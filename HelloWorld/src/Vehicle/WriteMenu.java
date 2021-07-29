package Vehicle;

import java.util.Scanner;

public class WriteMenu {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		Menu m = new Menu();
		m.init();
		
		while(true) {
			
			System.out.println("추가할 메뉴를 입력해 주세요.");
			String n = sc.nextLine(); //홍차 입력, 일로 올라오면서 n에 자동으로 \n들어감
			
			if(n.equals("")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
			System.out.println("추가한 메뉴의 가격을 입력해 주세요.");
			//2000입력하고 엔터치는 순간 \n값이 버퍼에 남아있고
			int p = sc.nextInt(); //2000 입력 2000입력하고 엔터치는 순간 \n값이 버퍼에 남아있음
			sc.nextLine(); //\n값을 비워줌 (만약에 없다면?) //이곳으로 마법사 문자열 들어감..
			 
			m.AddName(n);			
			m.AddPrice(p);
		}
		
		System.out.println();
		System.out.println("입력받은 메뉴와 가격");
		m.ShowMenu();
		sc.close();
		
	}
}
