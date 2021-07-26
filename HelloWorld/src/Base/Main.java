package Base;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		//4byte int
		// 00000000 00000000 00000000 00000000
		// MSB 부호 비트 0 양수, 1 음수
		
		//overflow 오버플로우
		System.out.println(Integer.MAX_VALUE + 1);
		System.out.println(Integer.MAX_VALUE + 2);

	}

}
