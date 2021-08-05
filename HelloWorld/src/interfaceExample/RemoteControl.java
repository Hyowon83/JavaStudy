package interfaceExample;

public interface RemoteControl {
	public int MAX_VOLUME = 10; //인터페이스에서의 상수 선언방법.(일반 변수가 상수가 된다.)
	public int MIN_VOLUME = 0;
	
	public void turnOn(); //인터페이스에서의 추상메소드 선언방법.(abstract가 필요없다.) body 없음.
	public void turnOff();
	public void setVolume(int volume);
	
	default void setMute(boolean mute) { //인터페이스에서의 디폴트메소드 선언방법.(default를 붙여줌) body 있음.
		if(mute) {
			System.out.println("무음처리합니다.");
		} else {
			System.out.println("무음해제합니다.");
		}
	}
	
	static void changeBettery() { //정적 메소드. body 있음.
		System.out.println("\n건전지를 교체합니다.");
	}
}
