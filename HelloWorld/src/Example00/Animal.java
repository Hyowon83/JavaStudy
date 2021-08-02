package Example00;

public class Animal {
	int eye_count;
	int feet_count;
	
	Animal() {
		this.eye_count = 2;
		this.feet_count = 4;
	}
	Animal(int x, int y) {
		this.eye_count = x;
		this.feet_count = y;
	}
//	final void run() { //final을 붙이면 상속받은 자식도 변경 할 수 없다.
//		System.out.println("달린다.");
//	}
	void run() {
		System.out.println("달린다.");
	}
	void sound() {
		System.out.println("소리 낸다.");
	}
}
