import java.util.Scanner;
class Ex4_15{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int h1;
		int h2;
		int h3;
		
		
		do{
		System.out.print("��cm����:");
		 h1 = stdIn.nextInt();
		}while(h1<100);
		
		do{
		System.out.print("��cm�܂�:");
		 h2 = stdIn.nextInt();
		}while(h2<h1);
			
		do{
		System.out.print("��cm����:");
		 h3 = stdIn.nextInt();
		}while(h3<1);
		
		System.out.println("�g���@�W���̏d");
		
		for(int i = h1 ; i <= h2; i += h3){
			System.out.print(i);
			System.out.println("�@�@"+(i-100)*0.9);
		}	
	}
}
		
		
		