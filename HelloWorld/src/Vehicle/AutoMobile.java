package Vehicle;

//import java.util.ArrayList;

public class AutoMobile {

	public static void main(String[] args) {
		//Ŭ���� ȣ��.
		Car seltos = new Car(); // ���� ������Ʈ �ȿ� �־�� �����ٰ� �� �� ����.
		//�ٷ� �⺻ �����ڰ� ����ǰ� ȣ���.
		System.out.println(seltos.getColor());
		System.out.println(seltos.getGuest());
		System.out.println(seltos.getMaxSpeed());
		System.out.println(seltos.getnSpeed());
		System.out.println();
		
		Car avante = new Car("White",5,280,50); //�Ű��� �����ִ� �����ڰ� ȣ���.
		System.out.println(avante.getColor());
		System.out.println(avante.getGuest());
		System.out.println(avante.getMaxSpeed());
		System.out.println(avante.getnSpeed());
		System.out.println();
		
		Car grandeur = new Car("Black", 5, 320, 50, "Granadeur", 4);
		System.out.println(grandeur.getColor());
		System.out.println(grandeur.getGuest());
		System.out.println(grandeur.getMaxSpeed());
		System.out.println(grandeur.getnSpeed());
		System.out.println(grandeur.getModelName());
		System.out.println(grandeur.getnWheel());
		System.out.println();
		
		
		//�ʵ��� ���� setting
		// seltos.color = "White";
//		seltos.MaxSpeed = 240;
//		seltos.nSpeed = 0;
//		seltos.guest = 5;
//		seltos.ModelName = "Trendy";
//		seltos.nWheel = 4;
//		seltos.DailyRun = new ArrayList<Integer>();
//		seltos.DailyRun.add(30);
//		seltos.DailyRun.add(43);
//		seltos.DailyRun.add(56);
//		seltos.DailyRun.add(77);
//		
//		//�ʵ��� ���� getting
//		System.out.println("���� : " + seltos.color);
//		System.out.println("�ְ�ӵ� : " + seltos.MaxSpeed);
//		System.out.println("����ӵ� : " + seltos.nSpeed);
//		System.out.println("�ִ�°��� : " + seltos.guest);
//		System.out.println("�𵨸� : " + seltos.ModelName);
//		System.out.println("�������� : " + seltos.nWheel);
//		for(int run:seltos.DailyRun) { // advance for
//			System.out.println(run);
//		}
//		for(int i = 0; i < seltos.DailyRun.size(); i++) { // legacy for
//			System.out.println(seltos.DailyRun.get(i));
//		}
//		System.out.println();
		
		//�Լ��� set, get �� ���
//		seltos.setColor("Blue");
//		System.out.println("���� : " + seltos.getColor());
//		seltos.setGuest(3);
//		System.out.println("�°��� : " + seltos.getGuest());
//		seltos.drive(50);
//		System.out.println("����ӵ� : " + seltos.getnSpeed());
//		seltos.stop();
//		System.out.println("���� �� �ӵ� : " + seltos.getnSpeed());
	}

}
