package Base;

import java.util.ArrayList;

public class ArrayListPr {

	public static void main(String[] args) {
		//Array�� �޸𸮱����� �ٸ� ArrayList
		//���̸� �� �� �޸��� ���� ������ ���� ����� �� �ִ�.
		//CRUD(Create/Read/Update/Delete)
		ArrayList<String> stdtName = new ArrayList<String>();
		stdtName.add("John"); //ArrayList�� �ε��� �߰��ϴ� ���. //����
		stdtName.add("Jane");
		stdtName.add("James");
		stdtName.add("Jacob");
		stdtName.add("Johanson");
		stdtName.add("Joshua");
		System.out.println(stdtName.get(5)); //.get(��ȣ);���� �����´�.
		System.out.println();
		
		//ArrayList�� for������ ��� ���(method) //��ȸ
		for(int i = 0; i < stdtName.size(); i++) { //ArrayList�� ���̴� .size()�� �����´�.
			System.out.println(stdtName.get(i));
		}
		System.out.println();
		
		//ArrayList�� ������ �����ϴ� ��� //����
		stdtName.set(3, "Jason"); //stdtName�� �ε���3�� �ڸ��� "Jason"���� �ٲ۴�.
		
		for(int i = 0; i < stdtName.size(); i++) { //ArrayList�� ���̴� .size()�� �����´�.
			System.out.println(stdtName.get(i));
		}
		System.out.println();
		
		//ArrayList�� ���� �����ϴ� ��� // ����
		stdtName.remove(3); // by index
		stdtName.remove("Jason"); // by value
		// delete data and reduce the length(���̵� ���Ѵ�.)
		stdtName.clear(); //delete all
		//���̰� 0�� ArrayList�� �ȴ�.

	}

}
