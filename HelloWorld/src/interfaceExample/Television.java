package interfaceExample;


public class Television implements RemoteControl { 
	private int volume;
	
	public void turnOn() {
		System.out.println("TV 전원 ON");
	}
	public void turnOff() {
		System.out.println("TV 전원 OFF");
	}
	public void setVolume(int n) {
		if(n > RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}
		else if(n < RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume=n;
		}
		System.out.println("현재 TV 음량: "+this.volume);
	}
}
