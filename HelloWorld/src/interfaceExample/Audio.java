package interfaceExample;

public class Audio implements RemoteControl {
private int volume;
	
	public void turnOn() {
		System.out.println("Audio 전원 ON");
	}
	public void turnOff() {
		System.out.println("Audio 전원 OFF");
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
		System.out.println("현재 Audio 음량: "+this.volume);
	}
}
