import java.util.Scanner;
class Ex3_15{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�ϐ�a:"); int a = stdIn.nextInt();
		System.out.print("�ϐ�b:"); int b = stdIn.nextInt();
		
		if (a > b){
		int t = b;
		b = a;
		a = t;
		}
		System.out.println("a>b�ƂȂ�悤�Ƀ\�[�g���܂����B");
		System.out.println("�ϐ�a��"+ a + "�ł��B");
		System.out.println("�ϐ�b��"+ b + "�ł��B");
		}
		
}		