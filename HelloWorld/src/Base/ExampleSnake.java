package Base;

import java.util.Scanner;

public class ExampleSnake {
	
	public static void main(String[] args) {
//		final int n = 4;
//		
//		//�� 0, 1, 2, 3
//		for (int i = 0; i < 4; i++) {
//			//�� 0, 1, 2, 3
//			for (int j = 0; j < 4; j++) {
//				//System.out.print("");
//			}
//			//System.out.println();
//			if (i % 2 == 0) {
//				System.out.println("¦����" + i);
//			} else {
//				System.out.println("Ȧ����" + i);
//			}
//		}
		
		final Scanner sc = new Scanner(System.in);
		//��Ʈ�� + ����Ʈ + O
		final int n = sc.nextInt();
		int inc = 0;
		int m = 1;
		//�� 0 1 2 3
		for (int i = 0; i < n; i++) {

			if (i % 2 == 0) 
				m = 1;
			else 
				m = -1;
			
			//�� 0 1 2 3 
			for (int j = 0; j < n; j++) {
				inc = inc + m;
				System.out.printf("%3d", inc);
			}
			
			//8
			inc += n;
			if (i % 2 == 0) 
				inc = inc + 1;
			else 
				inc = inc - 1;
			System.out.println();
		}
		sc.close();
		
//		int n = 4;
//		int inc = 0;
//		for(int i = 0; i < n; i++) {
//			if (i%2==0) { //���� ¦������ ��
//				for (int j = 0; j < n; j++) {
//					inc++;
//					System.out.print(inc+" ");
//				}
//				System.out.println("");
//			} else {
//				for (int j = n; j > 0; j--) {
//					System.out.print(inc+j+" ");
//				}
//				System.out.println("");
//				inc = inc + n;
//			}
//		}
		//3�� 4�� 3��
//		for () { //��
//			for () { //�� 
//				for () { //��
//					
//				}
//			}
//		}
		

	}

}
