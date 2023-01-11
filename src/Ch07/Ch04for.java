package Ch07;

import java.util.Scanner;

public class Ch04for {

	public static void main(String[] args) {
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("HELLO WORLD");
//		}
		
		//1부터 10까지의 합
//		int sum = 0;
//		
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println("SUM = " + sum);
		
		//1부터 N까지의 합
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int N = sc.nextInt();
//		int sum = 0;
//		
//		for (int i = 1; i <= N; i++) {
//			sum += i;
//		}
//		System.out.println("SUM = " + sum);
		
		//N부터 M까지의 합
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int N = sc.nextInt();
//		System.out.print("정수를 입력하세요 : ");
//		int M = sc.nextInt();
//		int sum = 0;
//		
//		if (N > M) {
//			int tmp = N;
//			N = M;
//			M = tmp;
//		}
//		
//		for (int i = N; i <= M; i++) {
//			sum += i;
//		}
//		System.out.println("SUM = " + sum);
		
		//2단 출력
//		for (int i = 1; i < 10; i++) {
//			System.out.printf("2 * %d = %d\n", i, 2 * i);
//		}
		
		//N단 출력
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int N = sc.nextInt();
//		
//		for (int i = 1; i < 10; i++) {
//			System.out.printf("%d * %d = %d\n", N, i, N * i);
//		}
		
		//2 ~ 9단 출력
//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, i * j);
//			}
//			System.out.println();
//		}
		
		//2 ~ N단 출력
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int N = sc.nextInt();
//		
//		for (int i = 2; i <= N; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, i * j);
//			}
//			System.out.println();
//		}
		
		//N ~ M단 출력
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int N = sc.nextInt();
//		System.out.print("정수를 입력하세요 : ");
//		int M = sc.nextInt();
//		
//		if (N > M) {
//			int tmp = N;
//			N = M;
//			M = tmp;
//		}
//		
//		for (int i = N; i <= M; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, i * j);
//			}
//			System.out.println();
//		}
		
		//별찍기
		
		//1
		//*****
		//*****
		//*****
		//*****
		
//		for (int i = 0; i < 4; i++) { 
//			for (int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//2
		//*
		//**
		//***
		//****
		
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//높이 입력
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int N = sc.nextInt();
//		
//		for (int i = 0; i < N; i++) {
//		for (int j = 0; j <= i; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
		
		//3
		//****
		//***
		//**
		//*
		
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j <= 3 - i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//높이 입력
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int N = sc.nextInt();
//
//		for (int i = 0; i < N; i++) {
//		for (int j = 0; j <= 3 - i; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
		
		//4
		//   *
		//  ***
		// *****
		//*******
		
//		for (int i = 0; i < 4; i++) {
//			for (int j1 = 0; j1 <= 2 - i; j1++) {
//				System.out.print(" ");
//			}
//			for (int j2 = 0; j2 <= 2 * i; j2++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//높이 입력
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int N = sc.nextInt();
//		
//		for (int i = 0; i < N; i++) {
//			for (int j1 = 0; j1 <= (N - 2) - i; j1++) {
//				System.out.print(" ");
//			}
//			for (int j2 = 0; j2 <= 2 * i; j2++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//5
		//*******
		// *****
		//  ***
		//   *
		
//		for (int i = 0; i < 4; i++) {
//			for (int j1 = 0; j1 <= i - 1; j1++) {
//				System.out.print(" ");
//			}
//			for (int j2 = 0; j2 <= 2 * (3 - i); j2++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//높이 입력
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int N = sc.nextInt();
//		
//		for (int i = 0; i < N; i++) {
//			for (int j1 = 0; j1 <= i - 1; j1++) {
//				System.out.print(" ");
//			}
//			for (int j2 = 0; j2 <= 2 * (N - i - 1); j2++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
	}

}
