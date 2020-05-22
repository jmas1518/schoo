import java.util.Scanner;
class Ex4_17{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("®”’l:");
		int n = stdIn.nextInt();
		int m = 0;
		
		for(int i = 1;i<=n;i++){
			if(n%i == 0 ){
				
				System.out.println(i);
				 m = m+1;
			
			
		}
		System.out.println("–ñ”‚Í"+m+"ŒÂ‚Å‚·B");
	
	}
}

