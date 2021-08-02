package Example00;

public class Car {
	Tire FrontLeft;
	Tire FrontRight;
	Tire BackLeft;
	Tire BackRight;
	
	Car() {
		this.FrontLeft = new Tire("왼쪽 앞", 6);
		this.FrontRight = new Tire("오른쪽 앞", 2);
		this.BackLeft = new Tire("왼쪽 뒤", 3);
		this.BackRight = new Tire("오른쪽 뒤", 4);
	}
	int run() {
		System.out.println("자동차가 달립니다.");
		if(FrontLeft.roll() == false) {
			stop(); return 1;
		}
		if(FrontRight.roll() == false) {
			stop(); return 2;
		}
		if(BackLeft.roll() == false) {
			stop(); return 3;
		}
		if(BackRight.roll() == false) {
			stop(); return 4;
		}
		return 0;
	}
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
