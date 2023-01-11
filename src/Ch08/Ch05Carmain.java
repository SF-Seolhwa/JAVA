package Ch08;

class Ch05Car{
	String owner;
	int speed;
	int fuel;
	String model;
	
	//기능
	void Accel() {
		//fuel 체크 (-5)
		if (fuel - 5 <= 0) {
			fuel = 0;
			System.out.println("[ERR] 가속불가 - 연료가 부족합니다.");
		}
		else {
				fuel -= 5;
			//speed 체크 (max = 200km/h, +10)
			if (speed + 10 >= 200) {
				speed = 200;
				System.out.println("[WARN] 가속불가 - 최대속도입니다. 200km/h");
			}
			else {
				System.out.println("[INFO] 가속 - 현재속도 : " + speed + "km/h");
				speed += 10;
			}
		}
	}
	void Break() {
		//speed 체크 (min = 0km/h, -15)
		if (speed - 15 <= 0) {
			speed = 0;
			System.out.println("[WARN] 감속불가 - 현재속도 0km/h");
		}
		else {
			speed -= 15;
			System.out.println("[INFO] 현재속도 : " + speed + "km/h");
		}
	}
	
	//멤버 정보표시용 함수는 이후 toString()재정의로 대체
	void Info() {
		System.out.printf("차주 : %s 현재속도 : %d 연료량 : %d 차종 : %s\n", owner, speed, fuel, model);
	}
}

public class Ch05Carmain {

	public static void main(String[] args) throws InterruptedException {
		Ch05Car hong = new Ch05Car();
		hong.owner = "홍길동";
		hong.speed = 100;
		hong.fuel = 100;
		hong.model = "아반떼xd";

		hong.Info();	//owner, speed, fuel, model 출력
		while(true) {
			hong.Accel();
			hong.Break();
			Thread.sleep(500);
		}
		
	}

}
