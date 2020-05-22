package mkjava1;
import java.util.Scanner;

public class Ex7_9 {
	static Scanner stdIn = new Scanner(System.in);
	
	static int readPlusInt() {
		int n;
		do {
			System.out.print("正の整数値:");
			n = stdIn.nextInt();
		}while(n <=0);
		return n;
		}
	
	public static void main(String[] args) {
		readPlusInt();
	}


	
	
	

}
