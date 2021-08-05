package phoneExample;

public abstract class Phone { //추상클래스(abstract) : 얼굴만 있고 몸통은 없는 메소드를 선언 가능 함.
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public abstract void turnOn(); //자식클래스가 부모의 메소드를 가져다가 자유롭게 코딩 할 수 있음.
	public abstract void turnOff(); // 어차피 자식 클래스를 호출하면 상속받은 자식의 코딩이 나오기 때문.
	// 단, 자식은 추상 메소드를 반드시 정의해서 써야 함.
}
