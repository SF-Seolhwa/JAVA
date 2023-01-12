package Ch09;

//this : 만들어져있는 개체의 위치정보(주소)
//this를 통해 멤버변수와 매개변수를 구분
//this를 통해 동일클래스 내의 다른매개변수를 가지는 생성자를 호출

class Ch03Simple {
	int x;
	int y;
	
	Ch03Simple getThis() {
		return this;
	}
}

public class Ch03this {

	public static void main(String[] args) {
		Ch03Simple ob1 = new Ch03Simple();
		
		System.out.println("ob : " + ob1);
		System.out.println("this : " + ob1.getThis());
		
		Ch03Simple ob2 = new Ch03Simple();
		
		System.out.println("ob : " + ob2);
		System.out.println("this : " + ob2.getThis());
	}

}
