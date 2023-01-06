package Ch06;

import java.util.Scanner;

public class Ch02Elseif {

	public static void main(String[] args) {
		//국어, 영어, 수학
		//각 과목당 40점 미만 불합격
		//평균이 60점 미만이면 불합격
		//그게 아니라면 합격
		
		//국어 < 40 -> 불합격
		//영어 < 40 -> 불합격
		//수학 < 40 -> 불합격
		
//		Scanner sc = new Scanner(System.in);
//		
//		int kor = sc.nextInt();
//		int math = sc.nextInt();
//		int eng = sc.nextInt();
//		
//		int sum = kor + math + eng;
//		double evg = (double)sum / 3;
		
//		if (kor < 40) {
//			System.out.println("불합격");
//		}
//		else if (eng < 40) {
//			System.out.println("불합격");
//		}
//		else if (math < 40) {
//			System.out.println("불합격");
//		}
//		else if (evg < 60) {
//			System.out.println("불합격");
//		}
//		else {
//			System.out.println("합격");
//		}

//		if (kor < 40 || math < 40 || eng < 40) {
//			System.out.println("불합격");
//		}
//		else if (evg < 60) {
//			System.out.println("불합격");
//		}
//		else {
//			System.out.println("합격");
//		}
		
		//나이별로 요금을 부과하는 else if문을 만드세요
		//나이는 정수값으로 입력받습니다.
		//8세 미만 : 요굼 1000원
		//14세 미만 : 요굼 2000원 
		//20세 미만 : 요굼 2500원
		//20세 이상 : 요굼 3000원
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		
//		if (age < 8) {
//			System.out.println("1000원 입니다.");
//		}
//		else if (age < 14) {
//			System.out.println("2000원 입니다.");
//		}
//		else if (age < 20) {
//			System.out.println("2500원 입니다.");
//		}
//		else {
//			System.out.println("3000원 입니다.");
//		}
//		
//		sc.close();
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		int charge;
//		
//		if (age < 8) {
//			charge = 1000;
//		}
//		else if (age < 14) {
//			charge = 2000;
//		}
//		else if (age < 20) {
//			charge = 2500;
//		}
//		else {
//			charge = 3000;
//		}
//		
//		System.out.println("요금 : " + charge);
//		
//		sc.close();
	}

}
