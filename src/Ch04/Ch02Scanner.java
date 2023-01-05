package Ch04;

import java.util.Scanner;

public class Ch02Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//ctrl + shift + o (자동 import지정)
		
//		System.out.print("정수 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.println("입력된 정수 값 : " + num1);
//		
//		System.out.print("실수 입력 : ");
//		double num2 = sc.nextDouble();
//		System.out.println("입력된 실수 값 : " + num2);
//		
//		System.out.print("문자열 입력 : ");
//		String str1 = sc.next();						//문자열입력받기기능함수, 띄어쓰기는 포함하지않는다
//		System.out.println("입력된 문자열 : " + str1);
//		
//		System.out.print("문자열 입력 : ");
//		String str2 = sc.nextLine();
//		System.out.println("입력된 문자열 : " + str2);
		
		//nextLine() 함수사용시 주의할점
		//nextInt(), nextDouble(), next() 함수 사용 이후에 nextLine() 함수를 사용해서 문자열을 받는 경우 sc.nextLine()를 한번더 사용해서 읽어들이는 버퍼라인을 초기화 한다.
		
//		System.out.print("정수 입력 : ");
//		int num3 = sc.nextInt();
//		System.out.println("입력된 정수 값 : " + num3);
//		
//		sc.nextLine();
//		
//		System.out.print("문자열 입력 : ");
//		String str3 = sc.nextLine();
//		System.out.println("입력된 문자열 : " + str3);
//		
//		sc.close();
		
		//Scanner scanner = new Scanner(System.in);

		System.out.print("첫번째 수 : ");
		String strNum1= sc.nextLine();

		System.out.print("두번째 수 : ");
		String strNum2= sc.nextLine();

		int num1 = Integer.parseInt(strNum1); 
		int num2 = Integer.parseInt(strNum2); 

		int result = num1 + num2;
		System.out.println("덧셈 결과 : " + result);
		

	}

}
