package Ch16;

public class C04wrapper {

	public static void main(String[] args) {
		//Boxing (자료 -> Integer정수형 객체로 변환)
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = new Integer("300");
		
		//UnBoxing (Integer자료 -> 일반자료형)
		int value1 = obj1.intValue();
		int value2 = obj1.intValue();
		int value3 = obj1.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//자동 Boxing
		Integer obj = 100;
		int n1 = obj + 10;

	}

}
