import java.util.Scanner;
class Ex4_6_2{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("何個表示しますか ");
		int x = stdIn.nextInt();
		
		int i = 0;
		if (x>0){
		while (i<x){
			System.out.print('*');
			i++;
		}
			System.out.print("");
		}
		
	}
}