import java.util.Scanner;
class Ex4_24{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n ;
		do{
		System.out.print("³‚Ì®”’l:");
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
			System.out.println("‘f”‚Å‚·B");
		}else if(m>2){
			System.out.println("‘f”‚Å‚Í‚ ‚è‚Ü‚¹‚ñB");
		}else if(m == 1){
			System.out.println("‘f”‚Å‚Í‚ ‚è‚Ü‚¹‚ñB");
		}
	
	}
}

