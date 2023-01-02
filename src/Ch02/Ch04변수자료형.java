package Ch02;

public class Ch04변수자료형 {

	public static void main(String[] args) {
		//-------------------------
		//정수 : int - 4byte 정수
		//-------------------------
//		int n1 = 0b10101101;	//2진수
//		int n2 = 173;			//10진정수
//		int n3 = 0255;			//8진수
//		int n4 = 0xad;			//16진수
//		System.out.printf("%d, %d, %d, %d\n", n1, n2, n3, n4);
		
		//-------------------------
		//정수 : byte - 1byte 정수
		//-------------------------
//		byte n1 = -128;
//		byte n2 = -30;
//		byte n3 = 30;
//		byte n4 = 127;
//		//byte n5 = 128;		//byte는 -128 ~ 127까지만 표현가능
//		byte n6 = (byte)128;	//int에서 byte로 강제변환 되면서 부호비트가 앞으로 오면서 -127이 됨
//		System.out.printf("%d\n", n6);
		
		//-------------------------
		//정수 : short - 2byte 정수 부호 o | char - 2byte 정수 부호 x (양수)
		//-------------------------
//		char n1 = 65535;		//0 ~ 65535 표현가능
//		short n2 = 32767;
//		
//		char n3 = 60000;
//		//short n4 = n3; 		//short는 -32768 ~ 32767까지만 표현가능
//		short n5 = (short)n3;
//		System.out.printf("%d", n5);
		
		//-------------------------
		//정수 : long - 8byte 정수 부호 o
		//-------------------------
//		long n1 = 10; 			//기본자료형에서 long으로 자동으로 형변환 됨
//		long n2 = 20L; 			//L, I(리터럴 접미사) : long 자료형 접미사 -> 형변환없이 자료를 넣음
//		//long n3 = 10000000000;	//기본자료형인 int의 범위를 벗어남
//		long n4 = 10000000000L;
		
		//-------------------------
		//실수
		//-------------------------
		//유리수와 무리수의 통칭
		//소숫점이하값을 가지는 수 123.456
		
		//float : 4byte 실수 (6~9자리)
		//double " 8byte 실수 (15~18자리)
		
		//정밀도 확인
//		float n1 = 0.123456789123456789F; //f,F : float형 접미사
//		double n2 = 0.123456789123456789;
//		
//		System.out.println(n1);
//		System.out.println(n2);
		
		//-------------------------
		//단일문자 : char - 2byte 정수
		//-------------------------
//		char ch1 = 'a';
//		System.out.println(ch1);
//		System.out.println((int)ch1); //011000001
//		
//		char ch2 = 98;
//		System.out.println(ch2);
//		System.out.println((int)ch2); //011000010
//		
//		char ch3 = 'b' + 1;
//		System.out.println(ch3);
//		System.out.println((int)ch3); //011000011
//		
//		byte ch4 = 'c' + 2;
//		System.out.println((char)ch4);
//		System.out.println(ch4);
//		
//		char ch5 = '가';
//		char ch6 = 0xac00;
//		System.out.printf("%c %c \n", ch5, ch6);
//		
//		// \\u : 유니코드값 이스케이프문자
//		System.out.printf("%c\n", '\uac80');
//		System.out.printf("%c\n", '\ufffd');
		
		//-------------------------
		//문자열 : String (클래스자료형)
		//-------------------------
		
		//기본자료형(원시타입)
//		byte n1;
//		short n2;
//		double n3;
//		long n4;
		
		//클래스자료형
		//클래자효령으로 만든 변수는 '참조변수'라고 하고 참조변수는 데이터가 저장된 위치정보(메모리주소값)이 저장된다.
//		int n1 = 10;
//		String name = "홍길동";
//		String job = "프로그래머";
//		System.out.println(name);
//		System.out.println(job);
		
		//-------------------------
		//boolean : 논리형(true/false) 저장
		//-------------------------
		
//		boolean flag = true;
//		if(flag) 
//		{
//			System.out.println("참인경우 실행");
//		}
//		else 
//		{
//			System.out.println("거짓인경우 실행");
//		
//		}
	}

}
