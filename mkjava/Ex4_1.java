import java.util.Scanner;
class Ex4_1{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int x;
		do{
		System.out.print("整数値:");
		int n = stdIn.nextInt();
		
		if(n>0)
			System.out.println("その値は正です。");
		else if (n < 0)
			System.out.println("その値は負です。");
		else
			System.out.println("その値は0です。");
			
		System.out.print("もう一度? 1…Yes/0…No:");
		 x = stdIn.nextInt();
		}while (x == 1);
	}
}

		