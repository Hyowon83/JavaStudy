package Base;

public class ArrayPr {
	
	public static void main(String[] args) {
		// int[] ar; // ar�̶�� �迭Ÿ�� ����(int ar[];)
		// int ar; // ar�̶�� ����Ÿ�� ����
		
		int n = 5;
		//String str[] = new String[n];
		String[] str = new String[n];
		//String[] xtr = new String[5];
		//�迭�� ���̸� �� ������� ��.
		
		str[0] = "Hello";
		str[1] = "World";
		str[2] = "John";
		str[3] = "Jane";
		str[4] = "Jacob";
		//str[5] = "James"; // ArrayIndexOutOfBound �ε��� ��輱�� �Ѿ��ٴ� ����.
		
		String x = str[2];
		System.out.println(x); //"John"
		System.out.println();
		
		
		//int[] pnt = new int[5]; // �ڸ��� ������ְ� ���� ����.
		//�ڹٿ����� ����Ÿ���� �迭�� ���� �������� �ʾƵ� 0���� �ʱ�ȭ �Ǿ�����.(�� ���� Ÿ���� null)
		int[] pnt = {1,3,34,-25,51}; // ���� �ʱ�ȭ��Ű�鼭 �ڸ��� ����.
		for(int i = 0; i < pnt.length; i++) {
			System.out.println(pnt[i]);
		}
		System.out.println();
		//for���� �迭�� ���ΰ���.

	}
}
