package Ch08;

class Ch14Person {
	//속성(필드, 멤버변수)
	String name;
	int age;
	float height;
	double weight;
	
	//생성자
	Ch14Person(String name, int age, float height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
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

	@Override
	public String toString() {
		return "Ch14Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
}

public class Ch14PersonMain {

	public static void main(String[] args) {
		Ch14Person hong = new Ch14Person("홍길동", 55, 177.5f, 80.1);		//생성자 함수를 지정
		System.out.println(hong.toString());							//모든 멤버변수가 확인될수있도록 toString()재정의

	}

}
