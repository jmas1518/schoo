import java.util.Scanner;
class Ex4_9{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1����x�܂ł̐ς����߂܂��B");
		int x ;
		do{
			System.out.print("x�̒l��:");
			x = stdIn.nextInt();
			}while (x <= 0);
			
		int y = 1;          //�l
		int i = 1;
		
		while(i <= x){
			y  *= i;
			i = i+1;
			}
			System.out.println("1����"+x+"�܂ł̐ς�"+y+"�ł��B");
	}
}
