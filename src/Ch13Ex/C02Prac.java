package Ch13Ex;

import Ch13.Employee;
import Ch13.Parttimer;
import Ch13.Regular;

//-------------------------------
//Computer.java
//-------------------------------
//[기능]
//PowerOn(){"전원을 켭니다"}
//PowerOff(){"전원을 끕니다"}
class Computer {
	
	void PowerOn() {
		System.out.println("전원을 켭니다");
	}
	void PowerOff() {
		System.out.println("전원을 끕니다");
	}
}

//-------------------------------
//Notebook.java extends Computer
//-------------------------------
//[속성]
//-Owner:String
//-ProductNumber: static int
//[기능]
//setOwner(String name){}
//getOwner(){}
//getProductNumber(){}
//move(){"이동합니다"}
//->생성자를 쓸때마다 ProductNumber 값이 증가 해야함
//->ProductNum의 초기값은 1000으로 설정
class Notebook extends Computer {
	String Owner;
	static int ProductNumber = 1000;
	
	void setOwner(String name) {
		this.Owner = name;
	}
	String getOwner() {
		return this.Owner;
	}
	
	void Move() {
		System.out.println("이동합니다");
		ProductNumber += 1;
	}
}

//-------------------------------
//Tablet.java extends Notebook()
//-------------------------------
//[속성]
//-PenNumber : String
//[기능]
//Write(){"펜을 씁니다"}
//SetPenNumber(String Pen){}
//getPenNumber(){}
class Tablet extends Notebook {
	String PenNumber;
	
	void Write() {
		System.out.println("펜을 씁니다");
	}
	
	void setPenNumber(String Pen) {
		this.PenNumber = Pen;
	}
	String getPenNumber() {
		return this.PenNumber;
	}
}

//-------------------------------
//Main 
//-------------------------------
//Notebook Kim = new Notebook();
//Kim.setOwner("김성주");
//System.out.println("소유자:"+Kim.getOwner()+"PN"+Kim.getProductNumber());
//Kim.PowerOn();
//Kim.Move();
//Kim.PowerOff();
//Tablet Lee = new Tablet()
//Lee.setOwner("이승기");
//System.out.println("소유자:"+Lee.getOwner()+"PN"+Lee.getProductNumber());
//Lee.setPenNumber("1-2-3-4");
//Lee.PowerOn();
//Lee.Move();
//Lee.Write();
//Lee.PowerOff();
public class C02Prac {

	public static void main(String[] args) {
		Notebook Kim = new Notebook();
		Kim.setOwner("김성주");
		System.out.println("소유자:"+Kim.getOwner()+"PN"+Kim.getProductNumber());
		Kim.PowerOn();
		Kim.Move();
		Kim.PowerOff();
		Tablet Lee = new Tablet()
		Lee.setOwner("이승기");
		System.out.println("소유자:"+Lee.getOwner()+"PN"+Lee.getProductNumber());
		Lee.setPenNumber("1-2-3-4");
		Lee.PowerOn();
		Lee.Move();
		Lee.Write();
		Lee.PowerOff();
	}
}
