package Ch12;

//--------------------
//1 자바의 메모리 구조
//--------------------
//1) 스택영역 : {}내의 지역변수, {}내에서 생성, 벗어나면 소멸
//2) 클래스영역(메서드영역) : 공유메모리, static변수, 일반메서드, 생성자메서드, 프로그램 시작과 동시에 생성, 프로그램 종료시 소멸
//3) 힙영역 : 객체 저장공간, new 예약어 사용시 생성, 소멸은 JVM의 가비지 컬렉터에 의해서 소멸
class Ch01Simple {
	static int Num1 = 0;	//공유변수
	int Num2;
	
	//멤버함수
	void ShowNum() {
		System.out.printf("NUM1 : %d, NUM2 : %d\n", Num1, Num2);
	}
}

public class Ch01Static {

	public static void main(String[] args) {
		Ch01Simple obj1 = new Ch01Simple();
		Ch01Simple obj2 = new Ch01Simple();
		
		obj1.Num1 = 10;
		obj1.Num2 = 20;
		obj2.ShowNum();
		
		obj2.Num1 = 100;
		obj2.Num2 = 200;
		obj1.ShowNum();
		
		Ch01Simple.Num1 = 123;
		obj1.ShowNum();
		obj2.ShowNum();
	}

}
