package Ch02;

public class Ch03변수자료형 {

	public static void main(String[] args) {
		//leftValue = RightValue - 대입연산자(=)를 기준으로, 왼쪽은 leftValue(공간) 오른쪽은 RightValue(값)
		//leftValue(공간) = RightValue(값)
		
		int num1;					//4byte정수 공간 생성 + num1 이름 부여 (변수 선언 or 정의)
		num1 = 10;					//10값을 상수 Pool에 저장(int) 하고 num1 공간에 복사 (대입)
		int num2 = 4;				//4값을 상수 Pool에 저장(int) 하고 새로 만들어지는 4byte 정수공간 num2에 초기화
		int num3 = num1 + num2;		//num1의 값 + num2의 값을 4byte 정수공간 num3에 초기화
		System.out.println(num3);	//num3안의 값을 print

	}

}
