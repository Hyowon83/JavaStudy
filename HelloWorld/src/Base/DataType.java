package Base;


public class DataType {
	public static void main(String[] args) {
		int x;
		x=10;
		System.out.println(x);
		x=0123; //8����10 == 10����8
		System.out.println(x);
		x=0xfff; //16����fff == 10����4095
		System.out.println(x);
		float f;
		//f = 3.14; //f�� �ٿ����� ������ ������.
		f = 3.14f;
		System.out.println(f);
		char sch = 'a'; //'���ڵ�����' == �ѱ���
		System.out.println(sch);
		String str = "aaa"; //"���ڿ�������" == �ѱ��� �̻�
		System.out.println(str);
	}
}
