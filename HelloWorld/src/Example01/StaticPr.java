package Example01;

import Vehicle.Car; //���� ������Ʈ�� �ٸ� ��Ű���ȿ� �ִ� ������ ����Ʈ �� �� �ִ�.

public class StaticPr {

	public static void main(String[] args) {
		
		StaticTest t = new StaticTest();
		t.setField(10);
		t.setField("Hello");
		System.out.println(t.getT1() + "," + t.getT2());
		
		t.setK(7);
		System.out.println(t.getK());
		StaticTest st = new StaticTest();
		System.out.println(st.getK()); //static�� ���ϸ� �ٽ� �ν��Ͻ������� �ҷ��͵� �� �� �״�� �����ִ�.
		System.out.println(st.getT1() + "," + st.getT2()); //static�� �ƴ� �ν��Ͻ������� ���Ӱ� �ҷ��� �� ���� �ʱ�ȭ�ȴ�.
		
		Car avante = new Car("White",5,280,50); //�ٸ� ��Ű���� Ŭ������ ������ �� �� �ִ�.
		System.out.println(avante.getColor());
		System.out.println(avante.getGuest());
		System.out.println(avante.getMaxSpeed());
		System.out.println(avante.getnSpeed());
		System.out.println();
	}

}
