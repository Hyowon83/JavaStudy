package Example01;

public class ScopePr {

	public static void main(String[] args) {
		// 변수 사용 가능범위(중괄호 내로 제한된다.)
		// scope
		// endoscope (내시경)
		// microscope (현미경)
		// telescope (망원경)
		
		int a = 20, b = 9;
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i + "/" + a);
		}
		System.out.println("ok");
		for(int i = 0; i < 5; i++) {
			System.out.println(i * 2 + "/" + a);
		}
		f1(10, 5); //함수 f1의 매개변수 a, b에 각각 10과 5가 차례로 들어간다.
		f1(a, b); //함수 f1의 매개변수 a, b에 각각 main의 변수 a(20)값과 b(9)값이 들어간다.
		System.out.println(a + "/" + b); //함수 f1의 매개변수와는 관계없는 main의 변수이다.
		if(a > b) {
			//block
		} else {
			
		}

		//인스턴스 변수의 흐름
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
		t.setField(10); //함수이름이 같아도 매개변수의 데이터타입에 맞춰서 알아서 들어간다.
		t.setField("Hello");
		System.out.println(t.getT1() + "," + t.getT2()); //하지만 겟함수는 리턴값이 헷갈릴 수 있기때문에 이름이 같으면 안된다.
		//----------------------------------
		
		//메소드 오버로딩 이용 <- 다형성
		st.setT1(); //7
		st.setT1(100); //100
		st.setT1("-24"); //-24
	}
	
	public static void f1(int a, int b) { //중괄호를 벗어났기 때문에 f1의 매개변수는 f1내에서만 영향을 미친다.
		System.out.println(a / b);
	}
	

}
