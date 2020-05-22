import java.util.Scanner;
class Ex4_10{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("‰½ŒÂ*‚ð•\Ž¦‚µ‚Ü‚·‚©:");
		int n = stdIn.nextInt();
		
		if(n>0){
		for( int i = 0 ; i < n; i++)
		System.out.print('*');
		System.out.println();
		}
	}
}
