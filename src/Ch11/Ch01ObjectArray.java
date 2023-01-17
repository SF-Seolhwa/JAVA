package Ch11;

class Ch01Person {
	String name;
	String age;
	String addr;
	
	@Override
	public String toString() {
		return "Ch01Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
}

public class Ch01ObjectArray {

	public static void main(String[] args) {
		Ch01Person[] employee = new Ch01Person[3];
		
		employee[0] = new Ch01Person();
		employee[0].name = "홍길동";
		employee[0].age = "44";
		employee[0].addr = "44";
		
		//employee[1]에 객체 연결 이름 : 남길동 나이 : 22 주소 : 서울로 저장하기
		employee[1] = new Ch01Person();
		employee[1].name = "남길동";
		employee[1].age = "22";
		employee[1].addr = "서울";
		
		System.out.println(employee[0].toString());
		System.out.println(employee[1].toString());
	}

}
