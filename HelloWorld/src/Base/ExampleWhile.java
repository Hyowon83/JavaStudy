package Base;

import java.util.Scanner;

public class ExampleWhile01 {

	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		while(true) {
//			String a = s.nextLine();
//			if(a.equals("x")) {
//				System.out.println("���α׷� ����");
//				s.close();
//				return;
//			} else if(a.equals("m")) {
//				System.out.println("�޴� ����Ʈ");
//			} else if(a.equals("o")) {
//				System.out.println("�ֹ�");
//			} else if(a.equals("s")) {
//				System.out.println("������Ȳ");
//			} else {
//				System.out.println("���� �޴��Դϴ�. �ٽ� �Է����ּ���.");
//			}
//			
//		}
		
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		do {
			if(a.equals("m")) {
				System.out.println("�޴� ����Ʈ");
			} else if(a.equals("o")) {
				System.out.println("�ֹ�");
			} else if(a.equals("s")) {
				System.out.println("������Ȳ");
			} else {
				System.out.println("���� �޴��Դϴ�. �ٽ� �Է����ּ���.");
			}
			a = s.nextLine();
		} while(!a.equals("x"));
		System.out.println("���α׷� ����");
		s.close();

	}

}
