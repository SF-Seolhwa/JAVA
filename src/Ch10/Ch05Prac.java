package Ch10;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Prac {

	public static void main(String[] args) {
		//[문제]1차원 배열
		//10 크기의 int형 배열을 만들어서
		//반복문과 함께 해당배열의 0 - 9 까지 요소에 각각 정수값을 입력
		//합,평균,최대값,최소값을 구합시다
		
//		Scanner sc = new Scanner(System.in);
//		
//		int[] arr = new int[10];
//		int sum = 0;
//		int max, min;
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print("점수를 입력하세요 : ");
//			arr[i] = sc.nextInt();
//			sum += arr[i];
//		}
//		
//		max = arr[0];
//		min = arr[0];
//		for(int i = 0; i < arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//			if(min > arr[i]) {
//				min = arr[i];
//			}
//		}
//		
//		//다른방법
//		System.out.println("-----------정렬 후 확인-----------");
//		Arrays.sort(arr);
//		for(int a : arr) {
//			System.out.print(a +" ");
//		}
//		System.out.println("\n-----------정렬 후 확인-----------");
//		System.out.println("최대값 : " + arr[arr.length-1]);
//		System.out.println("최소값 : " + arr[0]);
//		
//		
//		//다른 방법
//		int max1 = Arrays.stream(arr).max().getAsInt();
//		int min1 = Arrays.stream(arr).min().getAsInt();
//		
//		System.out.println("합 : " + sum);
//		System.out.println("평균 : " + (double)sum / 10);
//		System.out.println("최대값 : " + max);
//		System.out.println("최소값 : " + min);
		
		//[문제]2차원 배열
		//문제 
		//5명의 학생의 국/영/수 점수를 입력받아 출력을 해봅시다
		//학생별 평균 구하기
		//과목별 평균 구하기
		//각 행의 합 과 전체 합 // 각행의 평균 전체 평균을 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][3];
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("%d 학생 점수입력(국/영/수 순서) : ", i+1);
				arr[i][j] = sc.nextInt();
			}
		}
		
		int[] std = new int[5];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				std[i] += arr[i][j];
			}
			System.out.printf("%d 학생 총점 : %d 평균 : %f\n", i+1, std[i], (double)std[i]/3);
		}
		
		int[] subject = new int[3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				subject[i] += arr[j][i];
			}
		}
		System.out.printf("국어 총점 : %d 국어 평균 : %f\n", subject[0], (double)subject[0] / 5);
		System.out.printf("수학 총점 : %d 수학 평균 : %f\n", subject[1], (double)subject[1] / 5);
		System.out.printf("영어 총점 : %d 영어 평균 : %f\n", subject[2], (double)subject[2] / 5);
		
		//출력예
		//1 학생 점수입력(국/영/수 순서) : 100 70 60
		//2 학생 점수입력(국/영/수 순서) : 99 98 66
		//3 학생 점수입력(국/영/수 순서) : 99 88 77 
		//4 학생 점수입력(국/영/수 순서) : 100 55 66
		//5 학생 점수입력(국/영/수 순서) : 55 66 77
		//1 학생 총점 : ? 평균 ? 
		//2 학생 총점 : ? 평균 ?
		//3 학생 총점 : ? 평균 ?
		//4 학생 총점 : ? 평균 ?
		//5 학생 총점 : ? 평균 ?
		//국어 총점 : ? 국어 평균 :?
		//영어 총점 : ? 영어 평균 :?
		//수학 총점 : ? 수학 평균 :?

	}

}
