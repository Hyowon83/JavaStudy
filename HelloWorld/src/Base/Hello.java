package Base;

public class Hello {
	public static void main(String[] args) {
		String name = "Hyowon";
		System.out.println(name);
		
		System.out.println("\"Hello\"");//ū����ǥ �ȿ� ū����ǥ�� �������ؼ� \�� Ȱ���Ѵ�.
		System.out.print("John\t28\n"); // \t ��, \n �ٹٲ�
		System.out.println("Jane\t25"); //println()�� \n�� ���� �ʾƵ� �ȴ�.
		
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
