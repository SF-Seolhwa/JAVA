package Ch08;

class Ch02Person{
	//속성(필드, 멤버변수)
	String name;
	int age;
	float height;
	double weight;
}

public class Ch02PersonMain {

	public static void main(String[] args) {
		Ch02Person hong = new Ch02Person();
		hong.name = "홍길동";
		hong.age = 55;
		hong.height = 177.5f;
		hong.weight = 70.5;
		System.out.printf("%s %d %f %f\n", hong.name, hong.age, hong.height, hong.weight);
	}

}
