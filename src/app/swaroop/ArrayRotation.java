package app.swaroop;

public class ArrayRotation {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int d= 3;
		int n = arr.length;
		int rotatedArray[] = rotate(arr,d,n);
		for(int i=0; i < rotatedArray.length; i++) {
			System.out.print(rotatedArray[i]+" ");
		}
	}

	private static int[] rotate(int arr[], int d, int n) {
		int temp[] = new int[n];
		for(int i = 0 ; i<n; i++) {
			if(i+d < n)
				temp[i] = arr[i+d];
			else if(i+d >= n)
				temp[i] = arr[i+d-n];
		}
		return temp;
	}
}

// Time complexity : O(n)
// Auxiliary Space : O(1)
