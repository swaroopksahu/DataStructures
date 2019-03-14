package app.swaroop;

public class Array {

	public static void main(String[] args) {
		int arr[] = {12,20,30,40,50};
		System.out.println(arr.getClass().getSuperclass());
		int arr1[][] = {{10,20,30,100},{40,50,60,101},{70,80,90,102},{9,99,999,9999}};
	//	singleDArray(arr);
		twoDArray(arr1);
	}

	private static void singleDArray(int[] arr) {
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	private static void twoDArray(int[][] arr1) {
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j<arr1.length ;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
