package Vehicle;

import java.util.ArrayList;

public class Menu { //����(����) only.�����ڵ�� �޼ҵ带 �����ϰ� �� �ȿ��� �־���Ѵ�.
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	//������ Ÿ���� ���ذ� �ʵ带 �ʱ�ȭ ����� �Ѵ�.
	public void init() {
		this.alName = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
	}
	//������ - �ַ� �ʱ�ȭ �۾����� �޼ҵ�. �̸��� Ŭ������ ���ƾ��Ѵ�. ��ȯ���� ����(��ȯ�� �� ���� �۾��� ����).
	Menu() { //new�����ڰ� ����� ���Ŀ� �ڵ�����/ȣ���� �ȴ�.
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
