package Vehicle;

public class Students {

	public static void main(String[] args) {
		// �л�Ŭ������ �ν��Ͻ����� s1�� �����.
		// s1 ���� �ʵ�鿡 ������ ���� �ִ´�.
		// ���
		
		Student s1 = new Student();
		
		s1.name = "Hyowon";
		s1.nYear = 4;
		s1.nClass = 1114;
		s1.nNumber = 20151126;
		s1.birthday = "19970212";
		s1.gender = "female";
		s1.mobile = "01099500240";
		
		System.out.println("�̸�: " + s1.name);
		System.out.println("�г�: " + s1.nYear);
		System.out.println("�ݹ�ȣ: " + s1.nClass);
		System.out.println("�й�: " + s1.nNumber);
		System.out.println("����: " + s1.birthday);
		System.out.println("����: " + s1.gender);
		System.out.println("�ڵ�����ȣ: " + s1.mobile);
	}

}
