package Vehicle;

import java.util.ArrayList;

public class AutoMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ŭ���� ȣ��.
		Car seltos = new Car(); // ���� ������Ʈ �ȿ� �־�� �����ٰ� �� �� ����.
		
		//�ʵ��� ���� setting
		seltos.color = "White";
		seltos.MaxSpeed = 240;
		seltos.nSpeed = 0;
		seltos.guest = 5;
		seltos.ModelName = "Trendy";
		seltos.nWheel = 4;
		seltos.DailyRun = new ArrayList<Integer>();
		seltos.DailyRun.add(30);
		seltos.DailyRun.add(43);
		seltos.DailyRun.add(56);
		seltos.DailyRun.add(77);
		
		//�ʵ��� ���� getting
		System.out.println("���� : " + seltos.color);
		System.out.println("�ְ�ӵ� : " + seltos.MaxSpeed);
		System.out.println("����ӵ� : " + seltos.nSpeed);
		System.out.println("�ִ�°��� : " + seltos.guest);
		System.out.println("�𵨸� : " + seltos.ModelName);
		System.out.println("�������� : " + seltos.nWheel);
		for(int run:seltos.DailyRun) { // advance for
			System.out.println(run);
		}
		for(int i = 0; i < seltos.DailyRun.size(); i++) { // legacy for
			System.out.println(seltos.DailyRun.get(i));
		}
	}

}
