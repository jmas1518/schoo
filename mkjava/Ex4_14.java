import java.util.Scanner;
class Ex4_14{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1����n�܂ł̘a�����߂܂��B");
		int n;
		
		do{
		System.out.print("n�̒l:");
		 n = stdIn.nextInt();
		}while(n<=0);	
		
		int sum = 0;
		
		
		for( int i = 1 ; i<=n; i++){
			sum += i;
			if(i != n){
			System.out.print(i+"+");
			}else
			System.out.print(i);
		
		}
		System.out.print("="+sum);
		
	}
}