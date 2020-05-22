package mkjava1;
import java.util.Scanner;

public class Ex7_4 {
	static int power(int n) {
		int sum =0;
		for(int i =1 ; i <= n; i++)
			sum +=i;
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1からnまでの全整数の和を求めます。");
		System.out.print("整数n:"); int n = stdIn.nextInt();
		
		System.out.println("全整数の和は"+power(n)+"です。");
	}
		
		
	
}
