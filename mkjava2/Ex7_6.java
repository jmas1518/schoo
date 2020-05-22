package mkjava1;

import java.util.Scanner;

public class Ex7_6 {
	static void printSeason(int m) {
		
		if(3 <= m && m <=5) 				System.out.print("春");
		if(6<= m && m<= 8)  				System.out.print("夏");
		if(9<= m && m <= 11)				System.out.print("秋");
		if(m==12 || m == 1 || m==2)			System.out.print("冬");
		
		System.out.println();
		
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("月を入力して季節を表示します。");
		System.out.print("月:"); int m = stdIn.nextInt();
		printSeason(m);
	}
}
