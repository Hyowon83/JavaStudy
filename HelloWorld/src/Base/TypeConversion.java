package Base;

public class TypeConversion {

	public static void main(String[] args) {
		float x = 128; //강제타입변환 : 큰 크기의 타입을 작은 타입으로 강제로 배정해줌.
		int y = (int)x; // casting을 이용해서 개발자가 코딩해줘야한다.
		
		int n = 128;
		float m = n; //자동타입변환 : 작은 크기의 타입을 큰 타입으로 배정될 때.
		
	}

}
