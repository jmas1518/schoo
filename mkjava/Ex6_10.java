import java.util.Random;
import java.util.Scanner;

class Ex6_10{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("óvëfêî:");
		int n = stdIn.nextInt();
		int [] a = new int[n];
		
		a[0] = 1+rand.nextInt(10);
		System.out.println("a[0]="+a[0]);
		
		for( int i = 1; i<n; i++){
			do{
				a[i] = 1 + rand.nextInt(10);
			}while(a[i]==a[i-1]);
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}