package Ch08;

import java.util.Scanner;

class Sum {
	//속성
	Scanner sc = new Scanner(System.in);
	//기능
	//인자 o, return o
	int sum1(int x, int y) {
		return (x + y);
	}
	//인자 o, return x
	void sum2(int x, int y) {
		System.out.println("SUM2(x, y) : " + (x + y));
	}
	//인자 x, return o
	int sum3() {
		System.out.print("SUM3(x, y) : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		return (x + y);
	}
	//인자 x, return x
	void sum4() {
		System.out.print("SUM4(x, y, z) : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		System.out.println("SUM4 : " + (x + y + z));
	}
}

public class Ch07SimpleMethodMain {

	public static void main(String[] args) {
		Sum Calc = new Sum();
		
		int r1 = Calc.sum1(10, 20);
		System.out.println("R1 : " + r1);
		
		Calc.sum2(10, 20);
		
		int r3 = Calc.sum3();
		System.out.println("R3 : " + r3);
		
		Calc.sum4();	//sc로 세수를 입력받아 세수의 합이 console 출력
	}

}
