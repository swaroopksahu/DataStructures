package app.swaroop;

public class ArrayRotation_ReversalAlgorithm {
	static int count = 0;
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int d = 2;
		int n = arr.length;
		rotateArray(arr,d,n);
	//	printArray(arr);
	}

	private static void printArray(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void rotateArray(int[] arr, int d, int n) {
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d, n-1);
		reverseArray(arr, 0 ,n-1);
	}

	private static int[] reverseArray(int[] arr, int start, int end) {
		int temp = 0;
		for(int i = start; i<end; i++) {
			temp = arr[i];
			arr[i] = arr[end];
			arr[end] = temp;
			end--;
		}
		count++;
		System.out.println("Step: "+count);
		printArray(arr);
		System.out.println();
		return arr;
	}

}
