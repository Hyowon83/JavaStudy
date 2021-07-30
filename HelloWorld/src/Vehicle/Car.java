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
	
	//������ �����ε�(constructor overloading) <- ������
	public Car() { //face //�⺻ ������(default constructor)
		//body
//		this.color = "Blue";
//		this.guest = 5;
//		this.MaxSpeed = 240;
//		this.nSpeed = 0;
		this("Blue", 5, 240, 0); //�����ڰ� �����ڸ� ȣ�� �� �� �ִ�.(�Ű����� ������ �´¾ַ� �˾Ƽ� ã�ư�)
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
	
	// ���� = �Լ�(�޼ҵ�) = �޼ҵ�(�ڹ�) = ����Լ�(C++)
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
