import java.util.Scanner;
class Ex4_11{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("カウントダウンします。");
		int n = stdIn.nextInt();
		
		for( int i = n ; i>=0; i--){
		System.out.print(i);
		}
	}
}