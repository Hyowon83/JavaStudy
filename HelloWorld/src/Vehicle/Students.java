package Vehicle;

public class Students {

	public static void main(String[] args) {
		// 학생클래스로 인스턴스변수 s1을 만든다.
		// s1 안의 필드들에 적당한 값을 넣는다.
		// 출력
		
		Student s1 = new Student();
		
		s1.name = "Hyowon";
		s1.nYear = 4;
		s1.nClass = 1114;
		s1.nNumber = 20151126;
		s1.birthday = "19970212";
		s1.gender = "female";
		s1.mobile = "01099500240";
		
		System.out.println("이름: " + s1.name);
		System.out.println("학년: " + s1.nYear);
		System.out.println("반번호: " + s1.nClass);
		System.out.println("학번: " + s1.nNumber);
		System.out.println("생일: " + s1.birthday);
		System.out.println("성별: " + s1.gender);
		System.out.println("핸드폰번호: " + s1.mobile);
	}

}
