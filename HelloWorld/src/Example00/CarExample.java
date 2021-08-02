package Example00;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 0; i <= 5; i++) {
			int PunkTire = car.run();
			switch(PunkTire) {
			case 1 : //FrontLeft
				System.out.println("왼쪽 앞 펑크");
				break;
			case 2 : //FrontRight
				System.out.println("오른쪽 앞 펑크");
				break;
			case 3 : //BackLeft
				System.out.println("왼쪽 뒤 펑크");
				break;
			case 4 : //BackRight
				System.out.println("오른쪽 뒤 펑크");
				break;
			}
			if(PunkTire != 0) break;
		}

	}

}
