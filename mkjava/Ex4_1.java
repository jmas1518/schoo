import java.util.Scanner;
class Ex4_1{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int x;
		do{
		System.out.print("�����l:");
		int n = stdIn.nextInt();
		
		if(n>0)
			System.out.println("���̒l�͐��ł��B");
		else if (n < 0)
			System.out.println("���̒l�͕��ł��B");
		else
			System.out.println("���̒l��0�ł��B");
			
		System.out.print("������x? 1�cYes/0�cNo:");
		 x = stdIn.nextInt();
		}while (x == 1);
	}
}

		