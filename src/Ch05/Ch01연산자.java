package Ch05;

import java.util.Scanner;

public class Ch01연산자 {

	public static void main(String[] args) {
		//산술연산자( + - * / % )
//		int a = 10, b = 20, c;
//		System.out.println("a + b = " + (a + b));
//		System.out.println("a - b = " + (a - b));
//		System.out.println("a * b = " + (a * b));
//		System.out.println("b / a = " + (b / a));		//나누기 - 몫
//		System.out.println("a % b = " + (a % b));		//나누기 - 나머지(1.짝홀수구분, 2.배수구분, 3.자리수제한, 4.끝자리구하기)
//		System.out.println("-a = " + -a);
		
		//대입연산자
		//공간 = 값(우선처리)
		
		//문제
		//두 정수를 입력받아 두수의 합 / 곱 / 차를 출력하는 프로그램을 만들어라
		//Scanner를 사용함
//		Scanner sc = new Scanner(System.in);
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		System.out.println("num1 + num2 = " + (num1 + num2));
//		System.out.println("num1 * num2 = " + (num1 * num2));
//		System.out.println("num1 - num2 = " + (num1 - num2));
		
		//복합대입연산자
//		int a = 10;
//		
//		a += 10;	//a = a + 10
//		a -= 5;		//a = a - 5
//		a *= 3;		//a = a * 3
//		
//		System.out.println("a = " + a);
		
		//비교연산자( > >= < <= == != ) - 중요
//		int a = 10;
//		int b = 20;
//		
//		System.out.println("A == B : " + (a == b));
//		System.out.println("A > B : " + (a > b));
//		System.out.println("A < B : " + (a < b));
//		System.out.println("A >= B : " + (a >= b));
//		System.out.println("A <= B : " + (a <= b));
//		System.out.println("A != B : " + (a != b));
		
		//논리연산자 - 중요
		//And연산 && : 모든 조건식이 true여야지만 true를 반환
		//Or연산 || : 조건식 중 하나라도 true면 true를 반환
		//! : true하면 false반환, false하면 true반환
		
//		System.out.println("true AND true = " + (true && true));
//		System.out.println("false AND true = " + (false && true));
//		System.out.println("true AND false = " + (true && false));
//		System.out.println("false AND false = " + (false && false));
//		
//		int a = 10, b = 20, c = 5;
//		System.out.println("(a > b) AND (a > c) = " + ((a > b) && (a > c)));
//		
//		System.out.println("true || true = " + (true || true));
//		System.out.println("false || true = " + (false || true));
//		System.out.println("true || false = " + (true || false));
//		System.out.println("false || false = " + (false || false));
//		
//		int a = 10, b = 20, c = 5;
//		System.out.println("(a > b) || (a > c) = " + ((a > b) || (a > c)));
//		
//		boolean flag = true;
//		System.out.println("flag : " + flag);
//		System.out.println("!flag : " + !flag);
		
		//증감연산자
		//++a(--a) : 전치 연산자 - 먼저 값 1증가(1감소) 이후 다른 연산자 처리
		//a++(a--) : 후치 연산자 - 다른 연산자 처리 먼저 한 후 1증가(1감소)
		
//		int a = 10, b = 10, c, d;
//		
//		c = --a + b--;
//		d = a-- + b--;
//		
//		System.out.printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d);
		
		//삼항연산자
		//(조건식)? 참인경우 실행코드 : 거짓인경우 실행코드;
		
//		int score = 85;
//		char grade = (score > 90) ? 'A' : 'B';
//		System.out.println(score + "점은 " + grade + "등급입니다.");
		

	}

}
