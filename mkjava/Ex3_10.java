import java.util.Scanner;
class Ex3_10{
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
		System.out.println("2‚Â‚Ì®”’l‚Ì’l‚Ì·‚Í"+(max-min)+"‚Å‚·B");
		
		
		}
		} 