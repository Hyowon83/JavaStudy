package Vehicle;

import java.util.ArrayList;

public class Car {
	// 속성 = 변수 =  필드(자바) = 멤버변수(C++)
	//필드는 초기값을 굳이 정해주지 않는게 좋다.
	private String color;
	private int MaxSpeed;
	private int nSpeed;
	private int guest;
	private String ModelName;
	private int nWheel;
	private ArrayList<Integer> DailyRun;
	//int nFuel;
	//int nYear;
	//int nPrice;
	//String FuelType; //gasoline/electricity/LPG/Hybrid...
	//ArrayList<String> alName;
	
	//생성자 오버로딩(constructor overloading) <- 다형성
	public Car() { //face //기본 생성자(default constructor)
		//body
//		this.color = "Blue";
//		this.guest = 5;
//		this.MaxSpeed = 240;
//		this.nSpeed = 0;
		this("Blue", 5, 240, 0); //생성자가 생성자를 호출 할 수 있다.(매개변수 갯수가 맞는애로 알아서 찾아감)
	}
	public Car(String a, int b, int c, int d) {
		this.color = a;
		this.guest = b;
		this.MaxSpeed = c;
		this.nSpeed = d;
	}
	public Car(String n, int m, int x, int y, String z, int w) {
		this.color = n;
		this.guest = m;
		this.MaxSpeed = x;
		this.nSpeed = y;
		this.ModelName = z;
		this.nWheel = w;
	}
	
	// 동작 = 함수(메소드) = 메소드(자바) = 멤버함수(C++)
	public void drive(int x) {
		this.nSpeed = x;
	}
	public void stop() {
		this.nSpeed = 0;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return MaxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		MaxSpeed = maxSpeed;
	}
	public int getnSpeed() {
		return nSpeed;
	}
	public void setnSpeed(int nSpeed) {
		this.nSpeed = nSpeed;
	}
	public int getGuest() {
		return guest;
	}
	public void setGuest(int guest) {
		this.guest = guest;
	}
	public String getModelName() {
		return ModelName;
	}
	public void setModelName(String modelName) {
		ModelName = modelName;
	}
	public int getnWheel() {
		return nWheel;
	}
	public void setnWheel(int nWheel) {
		this.nWheel = nWheel;
	}
	public ArrayList<Integer> getDailyRun() {
		return DailyRun;
	}
	public void setDailyRun(ArrayList<Integer> dailyRun) {
		DailyRun = dailyRun;
	}
	
}
