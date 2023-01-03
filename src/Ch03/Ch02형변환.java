package Ch03;

public class Ch02형변환 {

	public static void main(String[] args) {
		//강제 형변환
		//좁은범위공간에 큰값을 넣으려고 하는경우
		//기본적으로 불가능하기 때문에 강제로 자료형을 바꾸어 전달한다
		//데이터 손실의 염려가 있다
		
		int intValue = 44032;
		//char charValue = intValue;	데이터 손실의 우려가 있어 오류발생 (큰공간의 값을 작은공간에 넣으려고 하는경우 발생)
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		//데이터손실
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		//char vs short
		char ch = '가';
		//short ch2 = ch; //short는 (-32768 ~ 32767)까지 저장가능하고 char은 (0~65535)까지 저장가능하므로 에러발생

	}

}
