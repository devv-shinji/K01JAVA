package ex10accessmodifier.cal;

public class Calculator2 {
	
	private Adder2 Adder2;
	private Subtractor2 Subtractor2;
	
	public Calculator2() {
		Adder2 = new Adder2();
		Subtractor2 = new Subtractor2();
	}
	
	public int addTwoNumber(int n1, int n2) {
		return Adder2.addTwoNumber(n1, n2);
	}
	public int subTwoNumber(int n1, int n2) {
		return Subtractor2.subTwoNumber(n1, n2);
	}
	
	
	public void showOpratingTimes() {
		System.out.println("덧셈횟수:"+ Adder2.getCntAdd());
		System.out.println("뺄셈횟수:"+ Subtractor2.getCntSub());
	}
	
}

class Adder2{
	private int cntAdd;
	
	Adder2(){
		cntAdd = 0;
	}
	
	public int getCntAdd() {
		return cntAdd;
	}
	
	int addTwoNumber(int n1, int n2) {
		cntAdd++;
		return n1 + n2;
	}
}
class Subtractor2{
	private int cntSub;
	
	public Subtractor2(){
		cntSub = 0;
	}
	
	public int getCntSub() {
		return cntSub;
	}
	
	int subTwoNumber(int n1, int n2) {
		cntSub++;
		return n1 - n2;
	}
}






