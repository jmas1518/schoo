import java.util.Scanner;
class Ex4_12{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("カウントアップします。");
		int n = stdIn.nextInt();
		
		for( int i = 0 ; i<=n; i++){
		System.out.print(i);
		}
	}
}