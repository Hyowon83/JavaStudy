package Base;

import java.util.Scanner;

public class ScannerPr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.next(); // ��������X
		s.nextLine(); // ��������O
		//int n = s.nextInt(); //�ٸ�Ÿ������ �о���ϼ��� �ִ�.
		//float f = s.nextFloat();
		
		//������ ���ڷ� �о�鿩�� ��ȯ���ִ� ����� ���� �����ϴ�.
		//int n = Integer.parseInt(str); �̷�������.(�߿���)
		//float f = Double.parseDouble(str);
		
		System.out.println("Hello "+str+"!!!");

	}

}
