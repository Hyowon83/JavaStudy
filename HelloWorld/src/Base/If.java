package Base;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
//		String str = "�ȳ�";
//		if(str=="�ȳ�") {
//			//���ڿ� �񱳴� �����(==)�� �ϸ� ������� �ʴ´�.
//		}
//		//���ڿ� ���ϴ� ���
//		if(str.equals("�ȳ�")) {
//			System.out.println("True");
//		}
		
//		String inital = s.nextLine();
//		//��ҹ��� �������� �´��� üũ�ϴ� ��.
//		if (inital.equalsIgnoreCase("ISU")) {
//			System.out.println("In Sang Un");
//		}
		
		"a".toUpperCase();
		"A".toLowerCase();
		"new example@naver.com".startsWith("new "); //true
		"append ".startsWith("new "); //false
		"abcccccccdefg".indexOf("c"); //2
		"[ abcd    ]".trim(); //"[abcd]"
		String[] tokens = "ABCD EFGH".split(" ");
		"ABCDEFGH".substring(2, 5);
		// ""[0:2] python����
		
		
		
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		
		if(name.equals("JHW")) {
			System.out.println("Jang Hyowon");
		}
		s.close();
	}

}
