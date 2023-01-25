package Ch18;

abstract class 호빵재료 {
	
}

class 팥 extends 호빵재료 {
	String meterial;
	
	팥(String meterial){
		this.meterial = meterial;
	}
	
	@Override
	public String toString() {
		return "팥 [meterial=" + meterial + "]";
	}	
}

class 야채 extends 호빵재료 {
	String meterial;
	
	야채(String meterial){
		this.meterial = meterial;
	}
	
	@Override
	public String toString() {
		return "야채 [meterial=" + meterial + "]";
	}
}

class 피자 extends 호빵재료 {
	String meterial;
	
	피자(String meterial){
		this.meterial = meterial;
	}
	
	@Override
	public String toString() {
		return "피자 [meterial=" + meterial + "]";
	}
}

class 민초 {
	String meterial;
	
	민초(String meterial){
		this.meterial = meterial;
	}
	
	@Override
	public String toString() {
		return "민초 [meterial=" + meterial + "]";
	}
}

class 호빵<T extends 호빵재료> {
	private T meterial;
	
	호빵(T meterial) {
		this.meterial = meterial;
	}
	
	void ShowInfo() {
		System.out.println(meterial.toString() + "으로 만든 호빵");
	}
}


public class C01Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		호빵<팥> 팥호빵 = new 호빵<팥>(new 팥("팥")); //호빵<팥> 팥호빵 = new 호빵(new 팥("팥")); //오른쪽은 생략가능
		팥호빵.ShowInfo();
		
		호빵<야채> 만두피호빵 = new 호빵(new 야채("만두피"));
		만두피호빵.ShowInfo();
		
		//호빵재료에 포함되지 않은 재료는 오류
//		호빵<민초> 민초호빵 = new 호빵(new 민초("치약맛"));
//		민초호빵.ShowInfo();
	}

}
