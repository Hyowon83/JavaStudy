package Example01;

import Vehicle.Car; //같은 프로젝트의 다른 패키지안에 있는 파일을 임포트 할 수 있다.

public class StaticPr {

	public static void main(String[] args) {
		
		StaticTest t = new StaticTest();
		t.setField(10);
		t.setField("Hello");
		System.out.println(t.getT1() + "," + t.getT2());
		
		t.setK(7);
		System.out.println(t.getK());
		StaticTest st = new StaticTest();
		System.out.println(st.getK()); //static을 셋하면 다시 인스턴스변수로 불러와도 셋 한 그대로 남아있다.
		System.out.println(st.getT1() + "," + st.getT2()); //static이 아닌 인스턴스변수는 새롭게 불러올 때 값이 초기화된다.
		
		Car avante = new Car("White",5,280,50); //다른 패키지의 클래스를 가져다 쓸 수 있다.
		System.out.println(avante.getColor());
		System.out.println(avante.getGuest());
		System.out.println(avante.getMaxSpeed());
		System.out.println(avante.getnSpeed());
		System.out.println();
	}

}
