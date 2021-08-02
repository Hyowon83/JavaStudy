package Example00;

public class Tire {
	int MaxRotation; //수명(몇 번 구르면 수명이 끝난다.)
	int AccRotation; //현재까지 회전한 횟수
	String location;
	
	Tire(String loc, int maxRoc) {
		this.location = loc;
		this.MaxRotation = maxRoc;
	}
	boolean roll() {
		++this.AccRotation;
		if(this.AccRotation < this.MaxRotation) {
			System.out.println(this.location + "Tire의 남은 수명 : " + (MaxRotation - AccRotation));
			return true;
		}
		System.out.println(this.location + "Tire 평크");
		return false;
	}
}
