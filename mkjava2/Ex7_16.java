package mkjava1;

import java.util.Scanner;

public class Ex7_16 {
	static int minOf(int[] a) {
		int min = a[0];
		for(int i = 1; i<a.length;i++) {
			if(a[i]<min)  min =a [i];
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("要素数:");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i =0; i<num;i++) {
			System.out.print("x["+i+"]:");
			x[i] = stdIn.nextInt();
		}
		System.out.println("配列の要素の最小値は"+minOf(x)+"です。");
		
	}
}
