package Ch08;

//지역변수 : {}내에서 선언된 변수, {} 벗어나면 소멸, 절차지향문법
class Localvar {
	//속성
	int num = 10;
	
	void func1() {
//		System.out.println("NUM : " + num);		//멤버변수 num
//		int num = 100;
//		System.out.println("NUM : " + num);		//func1()에서만 사용되는 지역변수 num
		
		if(true) {
			int num = 105;
			System.out.println("NUM : " + num);		//if문에서만 사용되는 지역변수 num
		}
		System.out.println("NUM : " + num);
	}

	void func2() {

	}
}

public class Ch08LocalVarTest {

	public static void main(String[] args) {
		Localvar obj = new Localvar();
		
		obj.func1();
		obj.func2();

	}

}
