import java.util.Scanner;
class Ex3_10{
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
		System.out.println("2つの整数値の値の差は"+(max-min)+"です。");
		
		
		}
		} 