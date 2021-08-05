package interfaceExample;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl tv = new Television(); //인터페이스명 인스턴스변수명 = new 구현클래스명();
		tv.turnOn();
		tv.setMute(false);
		tv.setVolume(7);
		tv.setMute(true);
		tv.turnOff();
		
		RemoteControl.changeBettery();
		
		RemoteControl audio = new Audio(); 
		audio.turnOn();
		audio.setMute(false);
		audio.setVolume(5);
		audio.setMute(true);
		audio.turnOff();
	}

}
