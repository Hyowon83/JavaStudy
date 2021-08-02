package Vehicle;

import java.util.ArrayList;

public class Menu { //선언(정의) only.실행코드는 메소드를 선언하고 그 안에만 있어야한다.
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	//데이터 타입을 정해고 필드를 초기화 해줘야 한다.
	public void init() {
		this.alName = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
	}
	//생성자 - 주로 초기화 작업용의 메소드. 이름이 클래스와 같아야한다. 반환값이 없다(반환할 수 없고 작업만 실행).
	Menu() { //new연산자가 실행된 직후에 자동실행/호출이 된다.
		this.alName = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
	}
	
	public void AddName(String name) {
		this.alName.add(name);
	}
	public void AddPrice(int price) {
		this.alPrice.add(price);
	}
	public void ShowMenu() {
		for(int i = 0; i < alName.size(); i++) {
			System.out.printf("[ %s / %d ]\n", this.alName.get(i), this.alPrice.get(i));
		}
	}
}