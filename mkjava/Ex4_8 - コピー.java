import java.util.Scanner;
class Ex4_8{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���̐����l�̌�����\�����܂��B");
		int x ;
		int n = 0;
		do{
			System.out.print("���̐����l:");
			x = stdIn.nextInt();
			}while (x <= 0);
			
			System.out.print("������");
			while(x>0){
			x /= 10 ;
			n = n+1;
			}
		System.out.print("������:"+n+"���ł��B");
	}	
}	