package coffeeShop;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu { // 선언(정의) only. not 실행코드 
	Scanner sc = new Scanner(System.in);
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	Menu() {
		alName = new ArrayList<String>();
		alPrice = new ArrayList<Integer>();
		this.load();
		
//		addName("Americano");
//		addName("Espresso");
//		addName("Latte");
//		addPrice(2000);
//		addPrice(2500);
//		addPrice(3000);
//		
//		showMenu();
	}
	/* 생성자 - 일종의 메소드
	 *         용도: 주로 초기화 작업용. 
	           명명법: 이름이 클래스와 같아야 함.
	           반환값: 반환값이 없다.(반환할 수 없이, 작업만 실행)
	           실행/호출: new연산자가 실행된 직후, 자동실행
	           다른 메소드/생성자를 호출할 수 있다.
	*/
	String getName(String menu_num) {
		return this.alName.get(Integer.parseInt(menu_num)-1);
	}
	int getPrice(String menu_num) {
		return this.alPrice.get(Integer.parseInt(menu_num)-1);
	}
	void appendMenu() {
		System.out.println("새 메뉴 추가");
		System.out.print("추가할 메뉴명 : ");
		String c_name = sc.nextLine(); //새 메뉴명 읽기
		if(c_name == null || c_name.equals("")) {
			wrongName();
			return;
		}
		this.addName(c_name); //메뉴명 추가
		System.out.print("추가할 메뉴가격 : ");
		int c_price = sc.nextInt(); //새 가격 읽기
		if(c_price < 0) {
			wrongPrice();
			return;
		}
		sc.nextLine();
		this.addPrice(c_price);
	}
	void addName(String name) {
		this.alName.add(name);
	}
	void addPrice(int price) {
		this.alPrice.add(price);
	}
	void addPrice(String price) {
		this.alPrice.add(Integer.parseInt(price));
	}
	void changeMenu() {
		System.out.println("기존메뉴 수정");
		System.out.print("수정할 메뉴 번호 : ");
		int u_num = sc.nextInt(); //수정할 메뉴번호 읽기
		sc.nextLine();
		if(u_num <= 0 || u_num > this.alName.size()) {
			notMenuNum();
			return;
		}
		System.out.print("수정할 메뉴명 : ");
		String u_name = sc.nextLine(); //수정된 메뉴명 읽기
		if(u_name == null || u_name.equals("")) {
			wrongName();
			return;
		}
		System.out.print("수정할 메뉴가격 : ");
		int u_price = sc.nextInt(); //수정된 가격 읽기
		if(u_price < 0) {
			wrongPrice();
			return;
		}
		sc.nextLine(); 
		this.alName.set(u_num - 1, u_name); //메뉴번호에 해당하는 메뉴명과 가격 수정하기
		this.alPrice.set(u_num - 1, u_price);
	}
	void deleteMenu() {
		System.out.println("기존메뉴 삭제");
		System.out.print("삭제할 메뉴 번호 : ");
		int d_num = sc.nextInt(); //삭제할 메뉴번호 읽기
		if(d_num <= 0 || d_num > this.alName.size()) {
			notMenuNum();
			return;
		}
		sc.nextLine();		
		this.alName.remove(d_num - 1); //메뉴 삭제하기
		this.alPrice.remove(d_num - 1);
	}
	void showMenu() {
		System.out.println("<메뉴판>");
		for(int i=0;i<this.alName.size();i++) {
			System.out.printf("%d %s \t %d\n", (i+1), this.alName.get(i) ,this.alPrice.get(i));
		}
		System.out.println();
	}
	void save() { //arrayList alName, alPrice를 화일(menu.txt)에 저장
		File file = new File("d:/menu.txt");
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(file));
			for(int i = 0; i < this.alName.size(); i++) {
				String name = this.alName.get(i);
				int price = this.alPrice.get(i);
				bw.write(name + "," + price + "\r\n");
			}
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	void load() { //화일(menu.txt)을 읽어서 arrayList alName, alPrice에 로드.
		File file=new File("d:/menu.txt");
		if(file.exists()) {
			BufferedReader inFile = null;
			try {
				inFile = new BufferedReader(new FileReader(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String line;
			try {
				line = inFile.readLine();
				while(line != null) {
					String[] parts = line.split(",");
					addName(parts[0]);
					addPrice(parts[1]);
					line = inFile.readLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	void notMenuNum() {
		System.out.println("메뉴번호가 일치하지 않습니다.");
		System.out.println();
	}
	void wrongPrice() {
		System.out.println("가격이 올바르지 않습니다.");
		System.out.println();
	}
	void wrongName() {
		System.out.println("메뉴명이 비어있습니다.");
		System.out.println();
	}
}
