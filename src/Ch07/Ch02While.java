package Ch07;

import java.util.Scanner;

public class Ch02While {

	public static void main(String[] args) {
		//구구단(2단 ~ 9단)
//		int dan = 2;
//		int	i = 1;
//		while (dan <= 9) {
//			while (i <= 9) {
//				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
//				i++;
//			}
//			i = 1;
//			dan++;
//			System.out.println();
//		}
		
		//2단 9단 출력
		//9 * 1 = 9
		//9 * 2 = 18
		//9 * 3 = 27
		//...
		//9 * 9 = 81
		//...
		//2 * 9 = 18
		
//		int dan = 9;
//		int	i = 1;
//		while (dan >= 2) {
//			while (i <= 9) {
//				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
//				i++;
//			}
//			i = 1;
//			dan--;
//			System.out.println();
//		}
		
		//2단 9단 출력
		//9 * 9 = 81
		//9 * 8 = 72
		//9 * 7 = 63
		//...
		//9 * 1 = 9
		//...
		//2 * 1 = 2
		
//		int dan = 9;
//		int	i = 9;
//		while (dan >= 2) {
//			while (i >= 1) {
//				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
//				i--;
//			}
//			i = 9;
//			dan--;
//			System.out.println();
//		}
		
		//N단을 입력받아 N단부터 9단까지 출력
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int i = 1;
//		
//		while (N <= 9) {
//			while (i <= 9) {
//				System.out.printf("%d * %d = %d\n", N, i, N * i);
//				i++;
//			}
//			i = 1;
//			N++;
//			System.out.println();
//		}
		
		
		//N, M을 입력받아 N부터 M단까지 출력(N < M, N < 8, M <= 9)
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		int i = 1;
//		
//		if (N > M) {
//			int tmp = N;
//			N = M;
//			M = tmp;
//		}
//		
//		while (N <= M) {
//			while (i <= 9) {
//				System.out.printf("%d * %d = %d\n", N, i, N * i);
//				i++;
//			}
//			i = 1;
//			N++;
//			System.out.println();
//		}
		
		//1
		//*****
		//*****
		//*****
		//*****
		//i(줄바꿈)	j(별찍기)
		//i = 0		j = 0
		//i++		j++
		//i < 4		j < 5
		
//		int i = 0;							//줄바꿈
//		int j = 0;
//		
//		while (i < 4) {
//			while (j < 5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			j = 0;
//			i++;
//		}
		
		//2
		//*
		//**
		//***
		//****
		
//		int i = 0;
//		int j = 0;
//		
//		while (i < 4) {
//			while (j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			j = 0;
//			i++;
//		}
		
		//높이만큼의 직각삼각형별이 출력되도록합니다.
		//높이 입력 : 3
		//*
		//**
		//***
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 입력 : ");
//		int num = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		
//		while (i < num) {
//			while (j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			j = 0;
//			i++;
//			System.out.println();
//		}
		
		//3
		//****
		//***
		//**
		//*
		
//		int i = 4;
//		int j = 0;
//		
//		while (i > 0) {
//			while (j < i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			j = 0;
//			i--;
//		}
		
		//높이 : 3
		//***
		//**
		//*
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int num = sc.nextInt();
//		int i = 0;
//		
//		while (num > 0) {
//			while (i < num) {
//				System.out.print("*");
//				i++;
//			}
//			System.out.println();
//			i = 0;
//			num--;
//		}
		
		//4
		//   *
		//  ***
		// *****
		//*******

//		int i = 0;
//		int k = 0;		//별
//		int j = 0;		//공백
//		
//		while(i < 4) {
//			while (j <= 2 - i) {
//				System.out.print(" ");
//				j++;
//			}
//			while (k <= 2 * i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//			j = 0;
//			k = 0;
//		}
		
		//높이 :
		//  *
		// ***
		//*****
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 입력 : ");
//		int h = sc.nextInt();
//		
//		int i = 0;
//		int k = 0;		//별
//		int j = 0;		//공백
//		
//		while(i < h) {
//			while (j <= (h - 2) - i) {
//				System.out.print(" ");
//				j++;
//			}
//			while (k <= 2 * i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//			j = 0;
//			k = 0;
//		}
		
		
		//5
		//*******
		// *****
		//  ***
		//   *
		
//		int i = 0;
//		int k = 0;		//별
//		int j = 0;		//공백
//		
//		while(i < 4) {
//			while (j < i) {
//				System.out.print(" ");
//				j++;
//			}
//			while (k <= 2 * (3-i)) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//			j = 0;
//			k = 0;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 입력 : ");
//		int h = sc.nextInt();
//		
//		int i = 0;
//		int k = 0;		//별
//		int j = 0;		//공백
//		
//		while(i < h) {
//			while (j < i) {
//				System.out.print(" ");
//				j++;
//			}
//			while (k <= 2 * ((h-1)-i)) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//			j = 0;
//			k = 0;
//		}
	}

}
