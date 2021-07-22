package Base;

public class Hello {
	public static void main(String[] args) {
		String name = "Hyowon";
		System.out.println(name);
		
		System.out.println("\"Hello\"");//큰따옴표 안에 큰따옴표를 쓰기위해선 \를 활용한다.
		System.out.print("John\t28\n"); // \t 탭, \n 줄바꿈
		System.out.println("Jane\t25"); //println()은 \n을 하지 않아도 된다.
		
		int value = 5;
		int x = value*3;
		System.out.println(x);
		
		//f format
		//d decimal
		System.out.printf("%d\n", 10);
		System.out.printf("%2d\n", 5);
		System.out.printf("%02d\n", 5);
	}
}
