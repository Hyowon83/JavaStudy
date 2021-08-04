package coffeeShop;
import java.util.ArrayList;

public class Order {
	Menu menu = new Menu();
	private ArrayList<String> alMobile;
	private ArrayList<String> alMenu;
	private ArrayList<Integer> alCount;
	private ArrayList<Integer> alTotal;
	
	Order() {
		alMobile = new ArrayList<String>();
		alMenu = new ArrayList<String>();
		alCount = new ArrayList<Integer>();
		alTotal = new ArrayList<Integer>();
	}
	
	int addOrder(String name, int price, int cnt) {
		//this.alMobile.add(mobile);
		this.alMenu.add(name);
		this.alCount.add(cnt);
		
		int total = price * cnt;
		this.alTotal.add(total);

		System.out.printf("주문메뉴 : %s\n메뉴가격 : %d 원\n주문수량 : %d 개\n이 메뉴의 총액 : %d 원\n", name, price, cnt, total);
		System.out.println();
		
		return total;
	}
	int getTotalSum() {
		//주문리스트의 총액을 모두 더해서 합계를 반환
		int nTotal = 0;
		for(int i : this.alTotal) {
			nTotal += i;
		}
		return nTotal;
	}
	String addMobile(String mobile) {
		this.alMobile.add(mobile);
		return mobile;
	}
	
	void totalMenu() {
		System.out.println("<주문내역>");
		for(int i = 0; i < this.alMenu.size(); i++) {
			System.out.printf("%d %s \t %d 잔\t%d 원\n", (i+1), this.alMenu.get(i) ,this.alCount.get(i), this.alTotal.get(i));
		}
	}

}
