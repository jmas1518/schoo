import java.util.Scanner;

class Ex4_22{
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("n段のピラミッドを作成する。");
		System.out.print("段数は:");
		int n = stdIn.nextInt();
		int k = 0;
		
		for (int i = 1; i <= n; i++){
			for( k = n; k >i;k--){
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++){ 
					System.out.print('*');
			}
			for (int m = 1; m < i; m++){
				System.out.print('*');
			}
			System.out.println();
		}
		
	}		
}



		