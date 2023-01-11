package Ch08;

class Ch04Person {
	//속성(필드, 멤버변수)
	String name;
	int age;
	float height;
	double weight;
	
	//기능(멤버 함수)
	void talk() {
		System.out.println(name + "님이 말합니다.");
	}
	void walk() {
		System.out.println(name + "님이 걷습니다.");		
	}
	void info() {
		System.out.printf("%s %d %f %f\n", name, age, height, weight);
	}
}

public class Ch04PersonMain {

	public static void main(String[] args) {
		Ch04Person hong = new Ch04Person();
		hong.name = "홍길동";
		hong.age = 55;
		hong.height = 177.5f;
		hong.weight = 70.5;
		
		hong.talk();
		hong.walk();
		hong.info();
	}

}
