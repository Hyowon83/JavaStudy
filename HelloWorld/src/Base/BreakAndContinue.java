package Base;

public class BreakAndContinue {

	public static void main(String[] args) {
		// break; 가장 안쪽의 반복문을 탈출
		// continue; 가장 안쪽의 반복문의 조건 위로 이동
		// for문에서의 continue는 헷갈리니까 주의
		
		// for문에서의 continue는 조건문으로 바로 가는게 아니라 후실행 후 조건문으로 돌아간다.
		for(int i = 0; i < 100; i++) {
			if(i>50) {
				System.out.println(i+" continue");
				continue;
			}
			System.out.println(i);
		}
	}

}
