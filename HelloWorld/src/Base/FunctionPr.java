package Base;

public class FunctionPr {
	//�Լ�
	//(1) �Լ� ����
	//(2) �Լ� ȣ�� => �Լ��� �����Ų��.
	//ExampleArrayList.java ����
	public static void main(String[] args) {
		// �Լ� ȣ��
		for(int i = 2; i < 10; i++) {
			show(i); // �Լ� �ȿ��� ����� ���� ���� �־��ش�.
			System.out.println("");
		}

	}
	
	// ���� ��� ��Ģ (1) $, _, ���ĺ����θ� ����
	//			  (2) �ι�° ���ں��ʹ� $, _, ���ĺ�, ���� ��밡��.
	public static void show(int a) { // ȣ�� �� �� ���� ���� �־��� ������ �����Ѵ�.
		// �Լ� ����(�޼ҵ� ����)
		for(int j = 2; j < 10; j++) {
			System.out.printf("%d x %d = %2d\n", a, j, a*j);
		}

	}

}
