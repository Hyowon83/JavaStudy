package Base;

public class ExampleWhile {

	public static void main(String[] args) {
		int a = 1;
		while(a<=9) {
			int b = 1;
			while(b<=9) {
				System.out.printf("%d x %d = %2d\n", a, b, a*b);
				b++;
			}
			System.out.println();
			a++;
		}

	}

}
