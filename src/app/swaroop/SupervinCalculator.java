package app.swaroop;

import java.util.Scanner;

public class SupervinCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. Of TCs: ");
		int T = sc.nextInt();
		int arrOfNo[] = new int[T];
		if(T >= 1 && T <= 100) {
			for(int i = 0; i < T; i++) {
				System.out.println("Enter no: ");
				arrOfNo[i] = sc.nextInt(); 
			}
			validateEachNumber(arrOfNo);
		}
	//	validateEachNumber(arrOfNo);
	}

	private static void validateEachNumber(int[] arrOfNo) {
		System.out.println("Entered validateEachNumber()");
		for(int i = 0; i< arrOfNo.length; i++) {
			validateNumber(arrOfNo[i]);
		}
		
	}

	private static void validateNumber(int N) {
		System.out.println("Entered validateNumber()");
		int num = N;
		int counter = 0;
		int ONES_PLACE = num%10;;
		boolean flag = true;
		while(!(ONES_PLACE == num)) {
			
			if(ONES_PLACE%2 == 0) {
				num = num/10;
				System.out.println("Even: num: "+num);
			}
			else{
				if((10-(N%10)) < 5) {
					N = N+1;
				}
				else {
					N = N-1;
				}
				counter++;
			}
			ONES_PLACE = num%10;
			System.out.println("while"+ONES_PLACE);
		}
		System.out.println("Counter: "+counter);
	}
}
