import java.util.Scanner;

class Ex5_3{
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("®”a:"); int a = stdIn.nextInt();
		System.out.print("®”b:"); int b = stdIn.nextInt();
		
		System.out.println("a < b ="+(a < b));
		System.out.println("a <= b ="+(a <= b));
		System.out.println("a > b ="+(a > b));
		System.out.println("a >= b ="+(a >= b));
		System.out.println("a == b ="+(a == b));
	}
}