package Ch08;

class Ch06Computer{
	String SerialNO;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	
	void PowerON() {
		System.out.println(SerialNO + "의 전원을 켭니다.");
	}
	void PowerOFF() {
		System.out.println(SerialNO + "의 전원을 끕니다.");
	}
	void ShowInfo() {
//		System.out.printf("%s %s %s %s\n", SerialNO, CPUSpec, RAMSpec, DISKSpec);
		System.out.println("SerialNO : " + SerialNO);
		System.out.println("CPUSpec  : " + CPUSpec);
		System.out.println("RAMSpec  : " + CPUSpec);
		System.out.println("DISKSpec : " + CPUSpec);
	}
}

public class Ch06Computermain {

	public static void main(String[] args) {
		Ch06Computer LGGram1010 = new Ch06Computer();
		LGGram1010.SerialNO="1010";
		LGGram1010.CPUSpec="I7";
		LGGram1010.RAMSpec="16G";
		LGGram1010.DISKSpec="2TB";
		LGGram1010.PowerON();		//SerialNO의 전원을 켭니다. 가 출력
		LGGram1010.ShowInfo();		//모든 멤버변수가 출력
		LGGram1010.PowerOFF();		//SerialNO의 전원을 끕니다. 가 출력

	}

}
