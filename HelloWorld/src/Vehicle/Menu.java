package Vehicle;

import java.util.ArrayList;

public class Menu {
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	public void init() {
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
			System.out.printf("[ %s / %d ]\n", alName.get(i), alPrice.get(i));
		}
	}
}
