package Example01;

public class StaticTest {
	static int k = -1; //�� Ŭ������ ����ϴ� ��� �ν��Ͻ����� ������ �� �ִ� �ʵ�.
	//final : ���� �ʵ��� ���� ������ �� ����.
	private int t1;
	private String t2;

	public void setField(int i) {
		this.t1 = i;
	}
	public void setField(String s) { //�Լ��� �̸��� ���Ƶ� �޴� ������ Ÿ�Կ� ���缭 �Լ��� ȣ��ȴ�.
		this.t2 = s;
	}
	public int getT1() {
		return this.t1;
	}
	public String getT2() {
		return this.t2;
	}
	public static void setK(int a) {
		k = a;
	}
	public static int getK() {
		return k;
	}
	
}
