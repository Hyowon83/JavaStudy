package Example00;

public class Human extends Animal {
	Human() {
		super(2, 2);
		//this.eye_count=2;
		//this.feet_count=2;
	}
	void run() {
		System.out.println("걷는다.");
	}
	void sound() {
		System.out.println("말한다.");
	}
	void study() {
		System.out.println("공부한다.");
	}
}
