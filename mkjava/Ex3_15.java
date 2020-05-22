import java.util.Scanner;
class Ex3_15{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("変数a:"); int a = stdIn.nextInt();
		System.out.print("変数b:"); int b = stdIn.nextInt();
		
		if (a > b){
		int t = b;
		b = a;
		a = t;
		}
		System.out.println("a>bとなるようにソートしました。");
		System.out.println("変数aは"+ a + "です。");
		System.out.println("変数bは"+ b + "です。");
		}
		
}		