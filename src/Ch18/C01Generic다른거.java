package Ch18;

//class 팥 {
//	String meterial;
//	
//	팥(String meterial){
//		this.meterial = meterial;
//	}
//	
//	@Override
//	public String toString() {
//		return "팥 [meterial=" + meterial + "]";
//	}	
//}
//
//class 야채 {
//	String meterial;
//	
//	야채(String meterial){
//		this.meterial = meterial;
//	}
//	
//	@Override
//	public String toString() {
//		return "야채 [meterial=" + meterial + "]";
//	}
//}
//
//class 피자 {
//	String meterial;
//	
//	피자(String meterial){
//		this.meterial = meterial;
//	}
//	
//	@Override
//	public String toString() {
//		return "피자 [meterial=" + meterial + "]";
//	}
//}
//
//class 민초 {
//	String meterial;
//	
//	민초(String meterial){
//		this.meterial = meterial;
//	}
//	
//	@Override
//	public String toString() {
//		return "민초 [meterial=" + meterial + "]";
//	}
//}
//
//class 호빵<T> {
//	private T meterial;
//	
//	호빵(T meterial) {
//		this.meterial = meterial;
//	}
//	
//	void ShowInfo() {
//		System.out.println(meterial.toString() + "으로 만든 호빵");
//	}
//}
//
//public class C01Generic다른거 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		호빵<팥> 팥호빵 = new 호빵<팥>(new 팥("팥")); //호빵<팥> 팥호빵 = new 호빵(new 팥("팥")); //오른쪽은 생략가능
//		팥호빵.ShowInfo();
//		
//		호빵<야채> 만두피호빵 = new 호빵(new 야채("만두피"));
//		만두피호빵.ShowInfo();
//	}
//
//}
