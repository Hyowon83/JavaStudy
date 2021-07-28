package Base;

public class FunctionPr {
	//함수
	//(1) 함수 선언
	//(2) 함수 호출 => 함수를 실행시킨다.
	//ExampleArrayList.java 참조
	public static void main(String[] args) {
		// 함수 호출
		for(int i = 2; i < 10; i++) {
			show(i); // 함수 안에서 선언된 변수 값을 넣어준다.
			System.out.println("");
		}

	}
	
	// 변수 명명 규칙 (1) $, _, 알파벳으로만 시작
	//			  (2) 두번째 문자부터는 $, _, 알파벳, 숫자 사용가능.
	public static void show(int a) { // 호출 될 때 받은 값을 넣어줄 변수를 선언한다.
		// 함수 선언(메소드 정의)
		for(int j = 2; j < 10; j++) {
			System.out.printf("%d x %d = %2d\n", a, j, a*j);
		}

	}

}
