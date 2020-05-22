package mkjava1;

import java.util.Scanner;

public class Ex7_3 {
	static int med(int a, int b, int c) {
		int med;
		if (a>b && a<c || a>c && a<b || a==b || a==c){
			med = a;
		}else if (b>a && b<c || b>c && b<a ||b==a || b==c ){
			med = b;
		}else{
			med = c;
		}
		return med;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a:"); int a = stdIn.nextInt();
		System.out.print("整数b:"); int b = stdIn.nextInt();
		System.out.print("整数c:"); int c = stdIn.nextInt();
		
		System.out.println("中央値は"+med(a,b,c)+"です。");
	}	
}
