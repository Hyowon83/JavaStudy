package Base;

public class ArrayPr {
	
	public static void main(String[] args) {
		// int[] ar; // ar이라는 배열타입 변수(int ar[];)
		// int ar; // ar이라는 정수타입 변수
		
		int n = 5;
		//String str[] = new String[n];
		String[] str = new String[n];
		//String[] xtr = new String[5];
		//배열의 길이를 꼭 정해줘야 함.
		
		str[0] = "Hello";
		str[1] = "World";
		str[2] = "John";
		str[3] = "Jane";
		str[4] = "Jacob";
		//str[5] = "James"; // ArrayIndexOutOfBound 인덱스 경계선을 넘었다는 에러.
		
		String x = str[2];
		System.out.println(x); //"John"
		System.out.println();
		
		
		//int[] pnt = new int[5]; // 자리만 만들어주고 값은 없음.
		//자바에서는 숫자타입의 배열은 값을 정해주지 않아도 0으로 초기화 되어있음.(그 외의 타입은 null)
		int[] pnt = {1,3,34,-25,51}; // 값을 초기화시키면서 자리도 만듦.
		for(int i = 0; i < pnt.length; i++) {
			System.out.println(pnt[i]);
		}
		System.out.println();
		//for문은 배열과 연인관계.

	}
}
