package Ch08;

class Ch11Simple {
	//속성
	int x;
	double y;
	char z;
	boolean flag;
	String name;
	//생성자
	Ch11Simple() {
		System.out.println("디폴트 샐성자 호출");
	}
	
	//기능
	@Override
	public String toString() {
		return "Ch11Simple [x=" + x + ", y=" + y + ", z=" + z + ", flag=" + flag + ", name=" + name + "]";
	}
	
}
public class Ch11ConstructorMain {

	public static void main(String[] args) {
		Ch11Simple obj = new Ch11Simple();
		System.out.println(obj.toString());
	}

}
