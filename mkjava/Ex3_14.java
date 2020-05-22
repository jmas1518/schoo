import java.util.Scanner;
class Ex3_14{
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
		if  (a == b){
			System.out.println("“ñ‚Â‚Ì’l‚Í“¯‚¶‚Å‚·B");
		}else{
			System.out.println("‘å‚«‚¢‚Ù‚¤‚Í"+max);
			System.out.println("¬‚³‚¢‚Ù‚¤‚Í"+min);
		}
		
		}
		}