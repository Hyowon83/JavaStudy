package Vehicle;

import java.util.Scanner;

public class WriteMenu {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		Menu m = new Menu();
		m.init();
		
		while(true) {
			
			System.out.println("�߰��� �޴��� �Է��� �ּ���.");
			String n = sc.nextLine(); //ȫ�� �Է�, �Ϸ� �ö���鼭 n�� �ڵ����� \n��
			
			if(n.equals("")) {
				System.out.println("�Է��� �����մϴ�.");
				break;
			}
			System.out.println("�߰��� �޴��� ������ �Է��� �ּ���.");
			//2000�Է��ϰ� ����ġ�� ���� \n���� ���ۿ� �����ְ�
			int p = sc.nextInt(); //2000 �Է� 2000�Է��ϰ� ����ġ�� ���� \n���� ���ۿ� ��������
			sc.nextLine(); //\n���� ����� (���࿡ ���ٸ�?) //�̰����� ������ ���ڿ� ��..
			 
			m.AddName(n);			
			m.AddPrice(p);
		}
		
		System.out.println();
		System.out.println("�Է¹��� �޴��� ����");
		m.ShowMenu();
		sc.close();
		
	}
}
