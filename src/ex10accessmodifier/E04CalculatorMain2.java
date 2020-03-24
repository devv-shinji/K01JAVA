package ex10accessmodifier;

import ex10accessmodifier.cal.Calculator2;

public class E04CalculatorMain2 {

	public static void main(String[] args) {

		Calculator2 cal = new Calculator2();
		
		//연산의 결과 출력
		System.out.println("10+20="+ cal.addTwoNumber(10, 20));
		System.out.println("55+98="+ cal.addTwoNumber(10, 20));
		System.out.println("100-77="+ cal.subTwoNumber(10, 20));
		
		//연산의 횟수 출력
		
		cal.showOpratingTimes();
	}

}
