package Vehicle;

//import java.util.ArrayList;

public class AutoMobile {

	public static void main(String[] args) {
		//클래스 호출.
		Car seltos = new Car(); // 같은 프로젝트 안에 있어야 가져다가 쓸 수 있음.
		//바로 기본 생성자가 실행되고 호출됨.
		System.out.println(seltos.getColor());
		System.out.println(seltos.getGuest());
		System.out.println(seltos.getMaxSpeed());
		System.out.println(seltos.getnSpeed());
		System.out.println();
		
		Car avante = new Car("White",5,280,50); //매개를 갖고있는 생성자가 호출됨.
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
		
		
		//필드의 값을 setting
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
//		//필드의 값을 getting
//		System.out.println("색상 : " + seltos.color);
//		System.out.println("최고속도 : " + seltos.MaxSpeed);
//		System.out.println("현재속도 : " + seltos.nSpeed);
//		System.out.println("최대승객수 : " + seltos.guest);
//		System.out.println("모델명 : " + seltos.ModelName);
//		System.out.println("바퀴갯수 : " + seltos.nWheel);
//		for(int run:seltos.DailyRun) { // advance for
//			System.out.println(run);
//		}
//		for(int i = 0; i < seltos.DailyRun.size(); i++) { // legacy for
//			System.out.println(seltos.DailyRun.get(i));
//		}
//		System.out.println();
		
		//함수로 set, get 후 출력
//		seltos.setColor("Blue");
//		System.out.println("색상 : " + seltos.getColor());
//		seltos.setGuest(3);
//		System.out.println("승객수 : " + seltos.getGuest());
//		seltos.drive(50);
//		System.out.println("현재속도 : " + seltos.getnSpeed());
//		seltos.stop();
//		System.out.println("정지 후 속도 : " + seltos.getnSpeed());
	}

}
