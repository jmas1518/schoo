import java.util.Scanner;
class Ex3_12{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("®”a:"); int a = stdIn.nextInt();
		System.out.print("®”b:"); int b = stdIn.nextInt();
		System.out.print("®”c:"); int c = stdIn.nextInt();
		
		int min = a;
		
		if ( min > b ){
			min = b;
		}if (min > c){
			min = c;
		}
		System.out.println("Å¬’l‚Í"+min+"‚Å‚·B");
		
		
		}
		} 