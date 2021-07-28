package Vehicle;

import java.util.ArrayList;

public class AutoMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스 호출.
		Car seltos = new Car(); // 같은 프로젝트 안에 있어야 가져다가 쓸 수 있음.
		
		//필드의 값을 setting
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
		
		//필드의 값을 getting
		System.out.println("색상 : " + seltos.color);
		System.out.println("최고속도 : " + seltos.MaxSpeed);
		System.out.println("현재속도 : " + seltos.nSpeed);
		System.out.println("최대승객수 : " + seltos.guest);
		System.out.println("모델명 : " + seltos.ModelName);
		System.out.println("바퀴갯수 : " + seltos.nWheel);
		for(int run:seltos.DailyRun) { // advance for
			System.out.println(run);
		}
		for(int i = 0; i < seltos.DailyRun.size(); i++) { // legacy for
			System.out.println(seltos.DailyRun.get(i));
		}
	}

}
