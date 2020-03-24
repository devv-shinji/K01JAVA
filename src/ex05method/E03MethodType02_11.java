package ex05method;

public class E03MethodType02_11 {
	
	static int noParamYesReturn() {
		int sum = 0;
		for(int i=1 ; i<=10 ; i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("1~10까지의 합: "+ noParamYesReturn());
		
		int sum10 = noParamYesReturn();
		System.out.println("1에서 10까지의 합: "+ sum10);
		System.out.printf("1에서 10까지의 합: %d", sum10);
	}

}
