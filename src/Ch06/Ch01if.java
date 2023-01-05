package Ch06;

import java.util.Scanner;

public class Ch01if {

	public static void main(String[] args) {
		//01 단순 IF
		
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if (age >= 8) {
//			System.out.println("학교에 다닙니다.");
//		}
//		
//		System.out.println("첫번째 IF 블럭 종료");
//		
//		if (age < 8) {
//			System.out.println("학교에 다니지 않습니다.");
//		}
//		
//		System.out.println("두번째 IF 블럭 종료");
//		System.out.println("프로그램을 종료합니다.");
		
		//02 IF ~ ELSE
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//
//		if (age >= 8) {
//			System.out.println("학교에 다닙니다.");
//		}
//		else {
//			System.out.println("학교에 다니지 않습니다.");
//		}
		
		//정수 하나를 받아 입력받은 수가 짝수인지 홀수인지 확인
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		if (num % 2 == 0) {
//			System.out.println("짝수입니다.");
//		}
//		else {
//			System.out.println("홀수입니다.");
//		}
		
		//정수 하나를 받아 입력받은 수가 3의배수인지 확인
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		if (num % 3 == 0) {
//			System.out.println("3의 배수입니다.");
//		}
//		else {
//			System.out.println("3의 배수가 아닙니다.");
//		}
		
		//두수를 입력받아 큰수를 출력
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("수를 입력하세요 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("수를 입력하세요 : ");
//		int num2 = sc.nextInt();
//		
//		if (num1 >= num2) {
//			System.out.println("큰수 : " + num1);
//		}
//		else {
//			System.out.println("큰수 : " + num2);
//		}
		//세수를 입력받아 큰수를 출력 (&& 연산자 사용해보기)
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();		
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("큰수 : " + num1);
		}
		if (num2 >= num1 && num2 >= num3) {
			System.out.println("큰수 : " + num2);
		}
		if (num3 >= num1 && num3 >= num2) {
			System.out.println("큰수 : " + num3);
		}


	}

}
