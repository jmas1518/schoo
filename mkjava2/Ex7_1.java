package mkjava1;
import java.util.Scanner;

class Ex7_1 {
	static int signOf(int n) {
		if(n<0) n = -1;
		if(n==0)n = 0;
		if(n>0) n = 1;
		
		return n;	
	}

	 public static void main(String[] args) {
		 Scanner stdIn = new Scanner(System.in);
		 
		 System.out.print("整数n:"); int n = stdIn.nextInt();
		 System.out.println("整数値nは"+signOf(n)+"です。");
		 
		

	}

}
