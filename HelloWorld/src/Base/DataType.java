package Base;


public class DataType {
	public static void main(String[] args) {
		int x;
		x=10;
		System.out.println(x);
		x=0123; //8진수10 == 10진수8
		System.out.println(x);
		x=0xfff; //16진수fff == 10진수4095
		System.out.println(x);
		float f;
		//f = 3.14; //f를 붙여주지 않으면 에러남.
		f = 3.14f;
		System.out.println(f);
		char sch = 'a'; //'문자데이터' == 한글자
		System.out.println(sch);
		String str = "aaa"; //"문자열데이터" == 한글자 이상
		System.out.println(str);
	}
}
