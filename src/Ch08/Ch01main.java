package Ch08;

public class Ch01main {

	public static void main(String[] args) {
		Ch01Person hong = new Ch01Person();
		hong.name = "홍길동";
		hong.age = 55;
		hong.height = 177.5f;
		hong.weight = 70.5;
		System.out.printf("%s %d %f %f\n", hong.name, hong.age, hong.height, hong.weight);

	}

}
