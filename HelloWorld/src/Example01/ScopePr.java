package Example01;

public class ScopePr {

	public static void main(String[] args) {
		// ���� ��� ���ɹ���(�߰�ȣ ���� ���ѵȴ�.)
		// scope
		// endoscope (���ð�)
		// microscope (���̰�)
		// telescope (������)
		
		int a = 20, b = 9;
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i + "/" + a);
		}
		System.out.println("ok");
		for(int i = 0; i < 5; i++) {
			System.out.println(i * 2 + "/" + a);
		}
		f1(10, 5); //�Լ� f1�� �Ű����� a, b�� ���� 10�� 5�� ���ʷ� ����.
		f1(a, b); //�Լ� f1�� �Ű����� a, b�� ���� main�� ���� a(20)���� b(9)���� ����.
		System.out.println(a + "/" + b); //�Լ� f1�� �Ű������ʹ� ������� main�� �����̴�.
		if(a > b) {
			//block
		} else {
			
		}

		//�ν��Ͻ� ������ �帧
		//----------------------------------
		ScopeTest s = new ScopeTest(8, "Hello");
		System.out.println(s.getT1());
		System.out.println(s.getT2());
		s.ShowAll();
		ScopeTest st = new ScopeTest(24, "World");
		System.out.println(st.getT1());
		System.out.println(st.getT2());
		st.ShowAll();
		//----------------------------------
		
		
		//----------------------------------
		ScopeTest t = new ScopeTest();
		t.setField(10); //�Լ��̸��� ���Ƶ� �Ű������� ������Ÿ�Կ� ���缭 �˾Ƽ� ����.
		t.setField("Hello");
		System.out.println(t.getT1() + "," + t.getT2()); //������ ���Լ��� ���ϰ��� �򰥸� �� �ֱ⶧���� �̸��� ������ �ȵȴ�.
		//----------------------------------
		
		//�޼ҵ� �����ε� �̿� <- ������
		st.setT1(); //7
		st.setT1(100); //100
		st.setT1("-24"); //-24
	}
	
	public static void f1(int a, int b) { //�߰�ȣ�� ����� ������ f1�� �Ű������� f1�������� ������ ��ģ��.
		System.out.println(a / b);
	}
	

}
