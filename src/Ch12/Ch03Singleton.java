package Ch12;

//디자인 패턴

//상품 제작시 사전에 발견되었건 문제들을 해결하고 정형화 시켜놓은 작업패턴
//디자인 패턴은 제작자들간의 의사소통 수단의 일종이다
//ex) 의류를 디자인 할 떄 일반적으로 알려진 패턴대로 재단을한다
//ex) 그렇게 하지 않을때 품질에 이상발생 가능성이 높다

//프로그래밍 언어의 디자인 패턴
//프로그램 제작시 사전에 발견되었던 문제들을 해결하고 정형화 시켜놓은 작업패턴

//싱글톤 - 하나의 객체를 공유하는 것

class Ch03Company {
	int x;
	int y;
	
	private static Ch03Company instance;
	
	//생성자
	private Ch03Company() {
		
	}
	
	//멤버함수
	public static Ch03Company getInstance() {
		if(instance == null) {
			instance = new Ch03Company();
		}
		return instance;
	}
}

public class Ch03Singleton {

	public static void main(String[] args) {
		//Ch03Company myCompany0 = Ch03Company; //불가능
		Ch03Company myCompany1 = Ch03Company.getInstance();
		Ch03Company myCompany2 = Ch03Company.getInstance();
		
		System.out.println(myCompany1 == myCompany2);
		myCompany1.x = 10;
		myCompany2.y = 20;
		Ch03Company myCompany3 = Ch03Company.getInstance();
		System.out.println(myCompany3.x + " " + myCompany3.y);

	}

}
