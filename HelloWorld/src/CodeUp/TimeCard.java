package CodeUp;

import java.util.Scanner;

public class TimeCard {
	public static void main(String[] args) {
		//백준 5575 타임카드
		Scanner sc = new Scanner(System.in);
		
		int h1 = 0, m1 = 0, s1 = 0;
		int h2 = 0, m2 = 0, s2 = 0;
		int h3 = 0, m3 = 0, s3 = 0;
		
		for(int i = 0; i < 3; i++) {
			String[] time = sc.nextLine().split(" ");
			
			int in_a = Integer.parseInt(time[0]);
			int in_b = Integer.parseInt(time[1]);
			int in_c = Integer.parseInt(time[2]);
			
			int out_a = Integer.parseInt(time[3]);
			int out_b = Integer.parseInt(time[4]);
			int out_c = Integer.parseInt(time[5]);
			
			int h = (out_a - 1) - in_a;
			int m = (out_b + 59) - in_b;
			int s = (out_c + 60) - in_c;
			
			if(s >= 60) {
				m += 1;
				s -= 60;
			}
			if(m >= 60) {
				h += 1;
				m -= 60;
			}
			h1 = h2;
			m1 = m2;
			s1 = s2;
			
			h2 = h3;
			m2 = m3;
			s2 = s3;
			
			h3 = h;
			m3 = m;
			s3 = s;
		}
		System.out.printf("%d %d %d\n", h1, m1, s1);
		System.out.printf("%d %d %d\n", h2, m2, s2);
		System.out.printf("%d %d %d\n", h3, m3, s3);
		
		
		sc.close();
	}
}
