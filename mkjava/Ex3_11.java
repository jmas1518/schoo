import java.util.Scanner;
class Ex3_11{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a:"); int a = stdIn.nextInt();
		System.out.print("整数b:"); int b = stdIn.nextInt();
		
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
			System.out.println("それらの差は10以下です。");
		}else {
			System.out.println("それらの差は11以上です。");
		}
		}
		} 