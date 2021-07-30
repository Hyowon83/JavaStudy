package Example01;

public class StaticTest {
	static int k = -1; //이 클래스를 기반하는 모든 인스턴스에서 공유할 수 있는 필드.
	//final : 정적 필드의 값을 수정할 수 없다.
	private int t1;
	private String t2;

	public void setField(int i) {
		this.t1 = i;
	}
	public void setField(String s) { //함수의 이름이 같아도 받는 변수의 타입에 맞춰서 함수가 호출된다.
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
