import java.util.Scanner;

class Ex2_5{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("xの値:");
		double a = stdIn.nextDouble();
		
		System.out.print("yの値:");
		double b = stdIn.nextDouble();
		
		System.out.println("合計は"+(a+b)+"です。");
		System.out.println("平均は"+(a+b)/2+"です。");
				}
	}