import java.util.Scanner;
class Ex4_7{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("‰½ŒÂ•\Ž¦‚µ‚Ü‚·‚©");
		int x = stdIn.nextInt();
		
		int i = 0;
		
		while(i<x){
			if(i%2 ==0){
			System.out.print("*");
			}else{
			System.out.print("+");
			}
			i++;
		}
	}
}		