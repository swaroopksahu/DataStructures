package app.swaroop;
/**
* <h1>SearchingTechniques</h1>
* The SearchingTechniques program implements an SearchingTechniquesImpl Interface that
* simply displays Linear Search Iterations and Binary Search Iterations to the standard output.
*
* @author  Swaroop Kumar Sahu
* @version 1.0
* @since   2019-03-06 
*/
public class SearchingTechniquesImpl implements SearchingTechniques {
	
	public static void main(String[] args) {
		int arr[] = {1, 5, 8, 9, 11, 13, 15, 19, 21};
		int x = 9;
		
		SearchingTechniques st = new SearchingTechniquesImpl();
		
		System.out.println("Linear Search Iterations: " + st.linearSearch(arr, x));
		System.out.println("Binary Search Iterations: " + st.binarySearch(arr, x));
	}
	
	@Override
	public int linearSearch(int arr[], int x) {
		int i;
		for(i=0; i<arr.length;i++) {
			if(arr[i] == x)
				break;
		}
		return i+1;
	}
	
	@Override
	public int binarySearch(int arr[], int x) {
		int low = 0;
		int high = arr.length;
		int mid = 0;
		int it = 0;
		
		do{
			mid = (low + high)/2;
			System.out.println("Mid: "+mid);
			if(arr[mid] == x) {
				System.out.println("Found: "+arr[mid]);
				it = it + 1;
				break;
			}
			else if(arr[mid] > x) {
				System.out.println(arr[mid]+ " > "+x);
				it = it + 1;
				high = mid;
			}
			else if(arr[mid] < x) {
				System.out.println(arr[mid]+ " < "+x);
				it = it + 1;
				low = mid;
			}
		}while(arr[mid] != x);
		return it;
	}
}
