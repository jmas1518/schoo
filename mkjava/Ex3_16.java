import java.util.Scanner;
class Ex3_16{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�ϐ�a:"); int a = stdIn.nextInt();
		System.out.print("�ϐ�b:"); int b = stdIn.nextInt();
		System.out.print("�ϐ�c:"); int c = stdIn.nextInt();
		if (a > b){
		int t = a;
		a = b;
		b = t;
		} if(a>c){
		int v = c;
		c = a;
		a = v;
		}if(b>c){
		int u = b;
		b = c;
		c = u;
		} 
		
		System.out.println("a<b<c�ƂȂ�悤�Ƀ\�[�g���܂����B");
		System.out.println("�ϐ�a��"+ a + "�ł��B");
		System.out.println("�ϐ�b��"+ b + "�ł��B");
		System.out.println("�ϐ�c��"+ c + "�ł��B");
		}
		
}		