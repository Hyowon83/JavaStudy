package Base;

public class BreakAndContinue {

	public static void main(String[] args) {
		// break; ���� ������ �ݺ����� Ż��
		// continue; ���� ������ �ݺ����� ���� ���� �̵�
		// for�������� continue�� �򰥸��ϱ� ����
		
		// for�������� continue�� ���ǹ����� �ٷ� ���°� �ƴ϶� �Ľ��� �� ���ǹ����� ���ư���.
		for(int i = 0; i < 100; i++) {
			if(i>50) {
				System.out.println(i+" continue");
				continue;
			}
			System.out.println(i);
		}
	}

}
