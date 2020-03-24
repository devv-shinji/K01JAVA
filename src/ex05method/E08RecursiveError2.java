package ex05method;

public class E08RecursiveError2 {

	public static void main(String[] args) {
		
		showHi(3);
	}
	
	public static void showHi(int cnt) {
		System.out.println("Hi~");
		System.out.println("cnt="+ cnt);
		
		if(cnt==1) {
			return;
		}
		showHi(--cnt);
		
	}

}
