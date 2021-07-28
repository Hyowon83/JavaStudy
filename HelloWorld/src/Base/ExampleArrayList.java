package Base;

import java.util.ArrayList;
import java.util.Scanner;

public class ExampleArrayList {

	public static void main(String[] args) {
		// 학생의 수학 점수를 읽어들이는 프로그램
		
		final Scanner sc = new Scanner(System.in);
		ArrayList<Integer> point = new ArrayList<Integer>();
		//int sum = 0;
		
		while(true) {
			System.out.println("추가 할 점수를 입력하세요.");
			int n = sc.nextInt();
			
			if(n == -1) {
				System.out.println("점수 입력이 끝났습니다.");
				System.out.println();
				break;
			}
			point.add(n);
			//sum = sum + n; // 입력받을때마다 sum에 합쳐준다.(총 합 구하기)
			System.out.printf("%d점이 추가되었습니다.\n", n);
			System.out.println();
			
		}

		OutPrint(point);
		int total = getSum(point);
		System.out.println("점수의 총 합 : " + total);			
		System.out.println("점수의 평균 : " + total/point.size());//(총합/길이)
		sc.close();
	}
	
	//전달받는 값이 배열의 숫자값이므로 ArrayList<Integer> point
	//전달받는 값이 실수일땐 float a로 받아야한다.
	public static void OutPrint(ArrayList<Integer> point) { //전달받는 값: 매개변수, 파라미터, 아규먼트
		System.out.println("점수 리스트");
		for(int i = 0; i < point.size(); i++) { 
			System.out.println(point.get(i));
		}
	}
	
	//반환값의 타입이 정수(int)인 함수
	public static int getSum(ArrayList<Integer> point) {
		int sum = 0;
		// for문을 이용한 인덱스 데이터 값을 모두 더하는 방법
		for(int j = 0; j < point.size(); j ++) {
			sum = sum + point.get(j);
		}
		return sum; //반환값이 정수
	}
}
