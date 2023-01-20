package Ch16;

class Employee {
	String id;
	String name;
	int salary;
	
	Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
//equals를 재정의하여 id와 salary가 같으면 ture 다르면 false를 반환하도록 하세요
	
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee down = (Employee)obj;
			return down.salary == this.salary && down.id == this.id;
		}
		return false;
	}
}

public class C03Object {

	public static void main(String[] args) {
		Employee ob1 = new Employee("1010", "홍길동", 5000);
		Employee ob2 = new Employee("2020", "김성훈", 6000);
		Employee ob3 = new Employee("1010", "홍길동", 5000);
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		System.out.println(ob2.equals(ob3));

	}

}
