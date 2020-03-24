package ex06array;

public class E07ForEachObject {

	public static void main(String[] args) {

		String[] strArr = new String[] {
				"자바는 재미있다",
				"자바는 유용하다",
				"그러나 매우 어렵다!"
		};
		
		for(String e : strArr) {
			System.out.println(e); //객체 2차원 배열도 만들 수 있다.
		}
	}

}
