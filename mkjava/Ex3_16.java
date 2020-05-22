import java.util.Scanner;
class Ex3_16{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("変数a:"); int a = stdIn.nextInt();
		System.out.print("変数b:"); int b = stdIn.nextInt();
		System.out.print("変数c:"); int c = stdIn.nextInt();
		if (a > b){
		int t = a;
		a = b;
		b = t;
		} if(a>c){
		int v = c;
		c = a;
		a = v;
		}if(b>c){
		int u = b;
		b = c;
		c = u;
		} 
		
		System.out.println("a<b<cとなるようにソートしました。");
		System.out.println("変数aは"+ a + "です。");
		System.out.println("変数bは"+ b + "です。");
		System.out.println("変数cは"+ c + "です。");
		}
		
}		