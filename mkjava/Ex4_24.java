import java.util.Scanner;
class Ex4_24{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n ;
		do{
		System.out.print("正の整数値:");
		 n = stdIn.nextInt();
		}while (n<=0);
		int m = 0;
		
		for(int i = 1;i<=n;i++){
			if(n%i == 0 ){
				 m = m+1;
				
			}
			if(m > 2) break;
		}
		if(m == 2){
			System.out.println("素数です。");
		}else if(m>2){
			System.out.println("素数ではありません。");
		}else if(m == 1){
			System.out.println("素数ではありません。");
		}
	
	}
}

