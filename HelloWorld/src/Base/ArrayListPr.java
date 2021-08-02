package Base;

import java.util.ArrayList;

public class ArrayListPr {

	public static void main(String[] args) {
		//Array와 메모리구조만 다른 ArrayList
		//길이를 모를 때 메모리의 낭비나 부족함 없이 사용할 수 있다.
		//길이를 선언하지 않고 추가하거나 삭제로 줄일 수 있기 때문.
		//CRUD(Create/Read/Update/Delete) 
		ArrayList<String> stdtName = new ArrayList<String>();
		// String(문자), Integer(정수), float(실수)
		stdtName.add("John"); //ArrayList에 인덱스 추가하는 방법. //생성
		stdtName.add("Jane");
		stdtName.add("James");
		stdtName.add("Jacob");
		stdtName.add("Johanson");
		stdtName.add("Joshua");
		System.out.println(stdtName.get(5)); //.get(번호);으로 가져온다.
		System.out.println();
		
		//ArrayList를 for문으로 찍는 방법(method) //조회
		for(int i = 0; i < stdtName.size(); i++) { //ArrayList의 길이는 .size()로 가져온다.
			System.out.println(stdtName.get(i));
		}
		System.out.println();
		
		//ArrayList의 내용을 수정하는 방법 //수정
		stdtName.set(3, "Jason"); //stdtName의 인덱스3번 자리를 "Jason"으로 바꾼다.
		
		for(int i = 0; i < stdtName.size(); i++) { //ArrayList의 길이는 .size()로 가져온다.
			System.out.println(stdtName.get(i));
		}
		System.out.println();
		
		//ArrayList의 내용 삭제하는 방법 // 삭제
		stdtName.remove(3); // by index
		stdtName.remove("Jason"); // by value
		// delete data and reduce the length(길이도 변한다.)
		stdtName.clear(); //delete all
		//길이가 0인 ArrayList가 된다.

	}

}