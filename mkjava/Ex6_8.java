import java.util.Scanner;

class Ex6_8{
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f��:");
		int n = stdIn.nextInt();
		double [] a = new double[n];
		
		for( int i = 0; i<n; i++){
			System.out.print("a["+i+"]=");
			a[i] = stdIn.nextDouble();
		}
		double sum = 0;
		for( double i : a){
			sum += i;
		}
		System.out.println("�S�v�f�̘a��"+sum+"�ł��B");
		System.out.println("�S�v�f�̕��ϒl��"+sum/n+"�ł��B");
	}
}