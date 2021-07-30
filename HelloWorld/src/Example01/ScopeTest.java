package Example01;

public class ScopeTest {
	private int t1;
	private String t2;
	
	//������ �����ε� <- ������
	public ScopeTest() {
	}
	
	//--------------------------------------------
	public ScopeTest(int t1, String t2) {
		this.t1 = t1; //this���� t1�� ���� �Ű������� ������ �򰥷��� this�� �� ������ش�.
		this.t2 = t2;
	}
	public ScopeTest(String t1, String t2) {
		this.t1 = Integer.parseInt(t1); //this���� t1�� ���� �Ű������� ������ �򰥷��� this�� �� ������ش�.
		this.t2 = t2;
	}
	//--------------------------------------------
		
	
	//--------------------------------------------
	public void setField(int i) {
		this.t1 = i;
	}
	public void setField(String s) { //�Լ��� �̸��� ���Ƶ� �޴� ������ Ÿ�Կ� ���缭 �Լ��� ȣ��ȴ�.
		this.t2 = s;
	}
	//--------------------------------------------
	
	public int getT1() {
		return this.t1; //�������� t1�� ������� ������ ��ġ�� �ʴ´�.
		//������ ���� ���ϱ� ���� this�� �ٿ��� ����������� �ƴ��� ǥ�����ִ°��� ����.
	}
	//�޼ҵ� �����ε� <- ������
	//�Ű������� Ÿ�� �Ǵ� ������ �ٸ� �� �ִ�.
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
