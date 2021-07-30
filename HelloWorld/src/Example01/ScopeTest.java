package Example01;

public class ScopeTest {
	private int t1;
	private String t2;
	
	//생성자 오버로딩 <- 다형성
	public ScopeTest() {
	}
	
	//--------------------------------------------
	public ScopeTest(int t1, String t2) {
		this.t1 = t1; //this없이 t1만 쓰면 매개변수와 변수가 헷갈려서 this를 꼭 사용해준다.
		this.t2 = t2;
	}
	public ScopeTest(String t1, String t2) {
		this.t1 = Integer.parseInt(t1); //this없이 t1만 쓰면 매개변수와 변수가 헷갈려서 this를 꼭 사용해준다.
		this.t2 = t2;
	}
	//--------------------------------------------
		
	
	//--------------------------------------------
	public void setField(int i) {
		this.t1 = i;
	}
	public void setField(String s) { //함수의 이름이 같아도 받는 변수의 타입에 맞춰서 함수가 호출된다.
		this.t2 = s;
	}
	//--------------------------------------------
	
	public int getT1() {
		return this.t1; //생성자의 t1은 여기까지 영향을 미치지 않는다.
		//하지만 보기 편하기 위해 this를 붙여서 멤버변수인지 아닌지 표기해주는것이 좋다.
	}
	//메소드 오버로딩 <- 다형성
	//매개변수의 타입 또는 갯수가 다를 수 있다.
	public void setT1() {
		this.t1 = 7;
	}
	public void setT1(int t1) {
		this.t1 = t1;
	}
	public void setT1(String str) {
		this.t1 = Integer.parseInt(str);
	}
	public String getT2() {
		return this.t2;
	}
	public void setT2(String t2) {
		this.t2 = t2;
	}
	public void ShowAll() {
		System.out.println(this.getT1() + "/" + this.getT2());
	}
	
}
