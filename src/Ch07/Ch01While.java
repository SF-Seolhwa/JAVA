package Ch07;

import java.util.Scanner;

public class Ch01While {

	public static void main(String[] args) {
		
		//기본 While
		
//		int i = 0;									//탈출용 변수 지정
//		while(i < 10) {								//조건식
//			System.out.println("hello world");
//			i++;									//조건식이 거짓이 되게끔 하기위한 연산
//		}
		//1부터 10까지의 합 구하기
		
//		int i = 1;
//		int sum = 0;
//		while (i <= 10) {
//			System.out.println("i 값 : " + i);
//			sum = sum + i; 						//sum += i;
//			i++;
//		}
//		
//		System.out.println("1부터 10까지의 합 : " + sum);
		
		//1부터 N까지(키보드로부터 입력)의 합을 구하여라
//		Scanner sc = new Scanner(System.in);
//		
//		int i = 1;
//		int sum = 0;
//		
//		System.out.print("정수를 입력하세요 : ");
//		int N = sc.nextInt();
//		
//		while (i <= N) {
//			sum += i;
//			i++;
//		}
//		
//		System.out.printf("1부터 %d까지의 합 : %d", N, sum);
		
		//N부터 M까지의 합 (N, M은 키보드로부터 입력)
		
//		Scanner sc = new Scanner(System.in);
//		
//		int sum = 0;
//		
//		System.out.print("정수를 입력하세요 : ");
//		int N = sc.nextInt();
//		
//		System.out.print("정수를 입력하세요 : ");
//		int M = sc.nextInt();
//		
//		int i = N;
//		
//		while (i <= M) {
//			sum += i;
//			i++;
//		}
//		
//		System.out.printf("%d부터 %d까지의 합 : %d", N, M, sum);
//		
//		sc.close();
		
		//N부터 M까지의 합 (N, M은 키보드로부터 입력), 조건 N < M 
		
//		Scanner sc = new Scanner(System.in);
//		
//		int i;
//		int sum = 0;
//
//		System.out.print("N의 값을 입력하세요 : ");
//		int N = sc.nextInt();
//		System.out.print("M의 값을 입력하세요 : ");
//		int M = sc.nextInt();
//		
//		if (N > M) {
//			int tmp = N;
//			N = M;
//			M = tmp;
//		}
//		
//		i = N;
//		
//		while (i <= M) {
//			sum += i;
//			i++;
//		}
//		
//		System.out.printf("%d부터 %d까지의 합 : %d", M, N, sum);
//		
//		sc.close();
		
		//구구단(2단)
//		int i = 1;
//		
//		while (i < 10) {
//			System.out.printf("2 * %d = %d\n", i, 2 * i);
//			i++;
//		}
		
//		int i = 1;
//		
//		while (i < 10) {
//			System.out.printf("2 * %d = %d\n", i, 2 * i++);
//		}
		
		//구구단(N단)
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int N = sc.nextInt();
//		int i = 1;
//		
//		while (i < 10) {
//			System.out.printf("%d * %d = %d\n", N, i, N * i);
//			i++;
//		}
//		
//		sc.close();
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int N = sc.nextInt();
//		int i = 1;
//		
//		while (i < 10) {
//			System.out.printf("%d * %d = %d\n", N, i, N * i++);
//		}
//		
//		sc.close();
		
		//1부터 10까지 수 중에 4의 배수만 출력
//		int i = 1;
//		
//		while (i <= 10) {
//			if (i % 4 == 0) {
//				System.out.println("i의 값 : " + i);
//			}
//			i++;
//		}
		
		//1부터 N까지 수 중에 4의 배수만 출력
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int N = sc.nextInt();
//		int i = 1;
//		
//		while (i <= N) {
//			if (i % 4 == 0) {
//				System.out.println("i의 값 : " + i);
//			}
//			i++;
//		}
//		
//		sc.close();
		
		//1부터 10까지 수 중에 3의 배수의 합만 출력
//		int i = 1;
//		int sum = 0;
//		
//		while (i <= 10) {
//			if (i % 3 == 0) {
//				System.out.println("i의 값 : " + i);
//				sum += i;
//			}
//			i++;
//		}
//		
//		System.out.println("합 : " + sum);
		
		//1부터 N까지 수 중에 3의 배수의 합만 출력
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int N = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		
//		while (i <= N) {
//			if (i % 3 == 0) {
//				System.out.println("i의 값 : " + i);
//				sum += i;
//			}
//			i++;
//		}
//		
//		System.out.println("합 : " + sum);
//		
//		sc.close();
		
	}

}
