import java.util.Scanner;
class Ex4_9{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1からxまでの積を求めます。");
		int x ;
		do{
			System.out.print("xの値は:");
			x = stdIn.nextInt();
			}while (x <= 0);
			
		int y = 1;          //値
		int i = 1;
		
		while(i <= x){
			y  *= i;
			i = i+1;
			}
			System.out.println("1から"+x+"までの積は"+y+"です。");
	}
}
