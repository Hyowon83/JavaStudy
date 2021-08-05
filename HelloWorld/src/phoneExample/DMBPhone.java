package phoneExample;

public class DMBPhone extends Phone {
	public DMBPhone(String owner) {
		super(owner);
	}
	public void turnOn() {
		System.out.println("DMB 전원을 킵니다.");
	}
	public void turnOff() {
		System.out.println("DMB 전원을 끕니다.");
	}
}
