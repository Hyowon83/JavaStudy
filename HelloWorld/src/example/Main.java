package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws IOException {
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		//read 읽기
		//write 쓰기
		//System.in 표준 입력 장치로 입력 받겠다. 
		//표준 입력 --> 키보드
		//표준 출력 --> 모니터(콘솔)
		
		//10---> 
		final int n = Integer.parseInt(br.readLine());
		
		//buffer 메모리 공간에 
		bw.write(n);
		bw.flush();
		bw.close();
	}
}
