import java.util.Scanner;
class Ex3_14{
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
		if  (a == b){
			System.out.println("二つの値は同じです。");
		}else{
			System.out.println("大きいほうは"+max);
			System.out.println("小さいほうは"+min);
		}
		
		}
		}