import java.util.Scanner;
class Ex3_11{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("®”a:"); int a = stdIn.nextInt();
		System.out.print("®”b:"); int b = stdIn.nextInt();
		
		int max ;
		int min ;
		
		if ( a < b ){
			max = b;
			min = a;
		}else{ 
			max = a;
			min = b;
		}
		if ((max-min)<=10){
			System.out.println("‚»‚ê‚ç‚Ì·‚Í10ˆÈ‰º‚Å‚·B");
		}else {
			System.out.println("‚»‚ê‚ç‚Ì·‚Í11ˆÈã‚Å‚·B");
		}
		}
		} 