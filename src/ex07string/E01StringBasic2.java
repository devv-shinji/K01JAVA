package ex07string;

public class E01StringBasic2 extends Object {//자바에서 항상 들어가는 Object클래스

	public static void main(String[] args) {

		int num1=10, num2=20;
		String numResult = (num1==num2) ?
				"데이터가 같다" : "데이터가 다르다";
		System.out.println(numResult);
		
		String str1 = new String("Hello Java");
		
		
		//""으로 스트링형으로 선언했을 때, 내용의 글자가 똑같으면 같은 주소값을 참조한다.
		String str3 = "Hello Java";
		String str4 = "Hello Java";
		if(str3==str4) {
			System.out.println(str3);
		}
		else {
			System.out.println(str3);
		}
		
		String str5 = "KOSMO";
		String str6 = "KOSMO";
		
		System.out.println(str5.equals(str6));
	}
}
