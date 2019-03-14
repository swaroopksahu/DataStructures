package app.swaroop;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of TCs: ");
		int T = sc.nextInt();
		if(T>0) {
		for(int i=0;i<T;i++) {
			
			System.out.println("Enter Size of Array: ");
			int N = sc.nextInt();
			
			System.out.println("Enter "+N+" valued array");
			ArrayList<Integer> al = new ArrayList<Integer>();
			while(N>0) {
				al.add(sc.nextInt());
				N--;
			}
			System.out.println("InputArray: "+al);
			
			validateString(al);
			
		}}
	}
	public static void validateString(ArrayList<Integer> al){
		System.out.println("String is: "+al);
		int i =0;
		int a = 0;
		int b =0;
		int z= 0;
		int c = 0;
		int d = 0;
		int alSize= al.size();
		int backtrace = 0;
		ArrayList<Integer> newAl = new ArrayList<Integer>();
		while(alSize>1 && i+1 < al.size()) {
			System.out.println("inside");
			backtrace = Math.abs(al.get(i) - al.get(i+1));
			if(backtrace > z) {
				a = al.get(i);
				b = al.get(i+1);
				c = i;
				d = i+1;
			}
			newAl.add(backtrace);
			if(z<=backtrace)
				z= backtrace;
			i++;
			alSize--;
		}
		System.out.println("a: "+a+" b: "+b+" c:"+c+" d: "+d);
		System.out.println(newAl);
		if(a>b)
			al.remove(c);
		else 
			al.remove(d);
		System.out.println(al);
		int size = al.size();
		System.out.println("Size:"+size);
		int result = 0;
		int j =0;
		while(size>1 && j+1 < al.size()) {
			result += Math.abs(al.get(j) - al.get(j+1));
			j++;
			size--;
		}
		System.out.println(result);
	}
}
