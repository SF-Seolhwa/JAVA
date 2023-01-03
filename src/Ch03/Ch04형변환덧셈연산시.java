package Ch03;

public class Ch04형변환덧셈연산시 {

	public static void main(String[] args) {
		//정수 연산식(int보다 작은 변수자료형(short, char, byte))
		//int로 자동 형변환
		
//		byte x = 10;
//		byte y = 20;
//		
//		//byte result1 = x + y;			//컴파일에러 : x, y는 각각 int형 자료로 담아서 처리가 되고 왼쪽 byte형으로 저장시 작은공간에 큰자료형타입을 넣으려는 문제발생
//		byte result1 = (byte)(x + y);	//강제 형변환 사용
//		int result2 = x + y;
//		System.out.println(result1);
//		System.out.println(result2);
		
		//정수 연산식(int보다 큰 변수 자료형(long))
		//큰 타입으로 자동 형 변환
//		byte var1 = 10;
//		int var2 = 100;
//		long var3 = 1000L;
//		//int result = var1 + var2 + var3;		//오른쪽 변수들은 long으로 자동형변환 but 왼쪽 공간이 작은공간이기 때문에 컴파일에러
//		int result = (int)var1 + (int)var2 + (int)var3;		//강제 형변환 사용
//		long result2 = var1 + var2 + var3;
//		
//		System.out.println(result);
//		System.out.println(result2);
		
		//실수연산식
		//큰 타입으로 자동 형변롼
//		int intvar = 10;
//		float flvar = 3.3F;
//		double dbvar = 5.5;
//		double result3 = intvar + flvar + dbvar;	//intvar, flvar가 각각 double형으로 형변환된다
//		
//		System.out.println(result3);
	}

}
