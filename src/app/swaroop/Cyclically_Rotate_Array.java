package app.swaroop;

public class Cyclically_Rotate_Array {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int ar[] = cyclicallyRotate(arr);
		for(int i =0;i<ar.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static int[] cyclicallyRotate(int[] arr) {
		int temp = arr[arr.length-1];
/*		int j = 0;
		for(int i = 1; i < arr.length;i++) {
			arr[n-j] = arr[n-i];
			j++;
		}*/
		for(int i = arr.length-1; i > 0 ;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		return arr;
	}

}
