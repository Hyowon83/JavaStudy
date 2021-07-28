package Base;

import java.util.ArrayList;
import java.util.Scanner;

public class ExampleArrayList {

	public static void main(String[] args) {
		// �л��� ���� ������ �о���̴� ���α׷�
		
		final Scanner sc = new Scanner(System.in);
		ArrayList<Integer> point = new ArrayList<Integer>();
		//int sum = 0;
		
		while(true) {
			System.out.println("�߰� �� ������ �Է��ϼ���.");
			int n = sc.nextInt();
			
			if(n == -1) {
				System.out.println("���� �Է��� �������ϴ�.");
				System.out.println();
				break;
			}
			point.add(n);
			//sum = sum + n; // �Է¹��������� sum�� �����ش�.(�� �� ���ϱ�)
			System.out.printf("%d���� �߰��Ǿ����ϴ�.\n", n);
			System.out.println();
			
		}

		OutPrint(point);
		int total = getSum(point);
		System.out.println("������ �� �� : " + total);			
		System.out.println("������ ��� : " + total/point.size());//(����/����)
		sc.close();
	}
	
	//���޹޴� ���� �迭�� ���ڰ��̹Ƿ� ArrayList<Integer> point
	//���޹޴� ���� �Ǽ��϶� float a�� �޾ƾ��Ѵ�.
	public static void OutPrint(ArrayList<Integer> point) { //���޹޴� ��: �Ű�����, �Ķ����, �ƱԸ�Ʈ
		System.out.println("���� ����Ʈ");
		for(int i = 0; i < point.size(); i++) { 
			System.out.println(point.get(i));
		}
	}
	
	//��ȯ���� Ÿ���� ����(int)�� �Լ�
	public static int getSum(ArrayList<Integer> point) {
		int sum = 0;
		// for���� �̿��� �ε��� ������ ���� ��� ���ϴ� ���
		for(int j = 0; j < point.size(); j ++) {
			sum = sum + point.get(j);
		}
		return sum; //��ȯ���� ����
	}
}
