package phoneExample;

public class SmartPhone extends Phone {
	
	public SmartPhone(String owner) {
		super(owner);
	}
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	@Override
	public void turnOn() { //부모의 추상 메소드를 가져다가 정의해서 자유롭게 코딩 함.
		System.out.println(this.owner + "의 핸드폰 전원을 킵니다.");
	}
	public void turnOff() {
		System.out.println(this.owner + "의 핸드폰 전원을 끕니다.");
	}
}
