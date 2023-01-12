package Ch09;

//정보은닉
//클래스 내의 멤버변수(멤버함수)의 사용을 제한하는 문법

//접근한정자
//public			: 모든 클래스에서 접근가능
//default(기본값)		: 동일 패키지에 속한 클래스에서만 접근가능
//private			: 련재 클래스내에서만 접근가능
//protected			: 공일패키지에 속한 클래스 or 상속관계에서의 하위클래스에서만 접근가능

class Ch01Person {
	//속성
	String name;		//이름
	private String id;			//주민번호
	private int age;			//나이
	float weight;		//몸무게
	double height;		//키
	private int salary;			//급여정보
	
	//생성자
	public Ch01Person(String name, String id, int age, float weight, double height, int salary) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.salary = salary;
	}
	
	//Setter함수
	public void setSalary(int salary) {
		this.salary = salary;
	}
	//Getter함수
	public int getSalary() {
		return this.salary;
	}
	
	//나머지 private 멤버를 getter and setter함수로 완성하기 - id는 getter만 만들기
	public String getId() {
		return this.id;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
}

public class Ch01InfoHide {

	public static void main(String[] args) {
		Ch01Person obj = new Ch01Person("홍길동", "888888-1111111", 40, 80.5f, 177.5, 8000);
		
		obj.name = "남길동";				//변경가능
//		obj.id = "777777-3333333";		//private로 지정된 멤버는 접근불가	
//		obj.salary = 9000;
		obj.setSalary(9000);			//Setter 함수를 통한 값변경
		
		obj.setAge(41);
		
		System.out.println("확인 : " + obj.getSalary());
		System.out.println("확인 : " + obj.getId());
		System.out.println("확인 : " + obj.getAge());

	}

}
