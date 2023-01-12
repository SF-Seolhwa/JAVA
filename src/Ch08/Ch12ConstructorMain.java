package Ch08;

class Ch12Simple {
	//속성
	int x;
	double y;
	char z;
	boolean flag;
	String name;
	//생성자
	Ch12Simple() {
		System.out.println("디폴트 샐성자 호출");
	}
	Ch12Simple(int x){
		System.out.println("Ch12Simple(int) 샐성자 호출");
		this.x = x;
	}
	Ch12Simple(int x, double y){
		System.out.println("Ch12Simple(int, double) 샐성자 호출");
		this.x = x;
		this.y = y;
	}
	Ch12Simple(int x, double y, char z){
		System.out.println("Ch12Simple(int, double, char) 샐성자 호출");
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//기능
	@Override
	public String toString() {
		return "Ch12Simple [x=" + x + ", y=" + y + ", z=" + z + ", flag=" + flag + ", name=" + name + "]";
	}
	
}
public class Ch12ConstructorMain {

	public static void main(String[] args) {
//		Ch12Simple obj = new Ch12Simple();
//		Ch12Simple obj = new Ch12Simple(10);
//		Ch12Simple obj = new Ch12Simple(10, 20.5);
		Ch12Simple obj = new Ch12Simple(10, 20.5, 'a');
		System.out.println(obj.toString());
	}

}
