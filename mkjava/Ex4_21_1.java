import java.util.Scanner;

class Ex4_21_1{
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("左上直角三角形を表示します。");
		System.out.print("段数は:");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++){
			for (int j = n; j >=i; j--){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}