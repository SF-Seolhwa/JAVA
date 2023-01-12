package Ch08;

class Ch09Simple {
	String name;
	
	int sum(int x, int y) {
		System.out.println("sum(int, int) 호출");
		return x + y;
	}
	int sum(double x, double y) {
		System.out.println("sum(double, double) 호출");
		return (int)(x + y);
	}
	int sum(int x, int y, int z) {
		System.out.println("sum(int, int, int) 호출");
		return x + y + z;
	}
	int sum(String str1, int x, int y) {
		System.out.println("sum(String, int, int) 호출");
		name = str1;
		return x + y;
	}

}

public class Ch09MethodOverloading {

	public static void main(String[] args) {
		Ch09Simple obj = new Ch09Simple();
		
		int result = obj.sum(10, 20, 30);
		System.out.println("RESULT : " + result);

	}

}
