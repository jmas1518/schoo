import java.util.Scanner;

class Ex5_4{
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�����la,b,c�̍��v�ƕ��ϒl�����߂܂��B");
		System.out.print("����a:"); int a = stdIn.nextInt();
		System.out.print("����b:"); int b = stdIn.nextInt();
		System.out.print("����c:"); int c = stdIn.nextInt();
		
		int sum = (a+b+c);
		double ave = sum/3.0;
		System.out.println("a,b,c�̍��v��"+sum+"�ł��B");
		System.out.println("a,b,c�̕��ς�"+ave+"�ł��B");
	}
}
