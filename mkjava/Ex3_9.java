import java.util.Scanner;
class Ex3_9{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a:"); int a = stdIn.nextInt();
		System.out.print("����b:"); int b = stdIn.nextInt();
		
		int max ;
		if (a<b)
			max = b;
		else
			max = a;
			
		System.out.println("�傫���ق��̒l��"+max+"�ł��B");
		
		
		}
		} 