package Vehicle;

import java.util.ArrayList;

public class Car {
	// �Ӽ� = ���� =  �ʵ�(�ڹ�) = �������(C++)
	//�ʵ�� �ʱⰪ�� ���� �������� �ʴ°� ����.
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
	
	// ���� = �Լ�(�޼ҵ�) = �޼ҵ�(�ڹ�) = ����Լ�(C++)
	void drive(int x) {
		this.nSpeed = x;
	}
	void stop() {
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
