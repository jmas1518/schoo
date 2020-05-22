import java.util.Scanner;
class Ex4_8{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("正の整数値の桁数を表示します。");
		int x ;
		int n = 0;
		do{
			System.out.print("正の整数値:");
			x = stdIn.nextInt();
			}while (x <= 0);
			
			System.out.print("桁数は");
			while(x>0){
			x /= 10 ;
			n = n+1;
			}
		System.out.print("桁数は:"+n+"桁です。");
	}	
}	