import java.util.Scanner;

class Ex4_3{

	public static void main(String[] args){
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("®”a:"); int a = stdIn.nextInt();
		System.out.print("®”b:"); int b = stdIn.nextInt();
		
		if (a > b){
		int t = b;
		b = a;
		a = t;
		}
		
		do{
				
				System.out.println(a);
				a = a+1;
				System.out.println(" ");
				
			
		}while (a<b);
		
		System.out.println(a);
		}
}
		