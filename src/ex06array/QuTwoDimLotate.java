package ex06array;
/*

 */
public class QuTwoDimLotate {

	public static void arrChange(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			int[] temp;
			
			temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void arrPrint(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12},
				{13, 14, 15}
			};
		
		arrChange(arr);
		arrPrint(arr);
		
	}
}
