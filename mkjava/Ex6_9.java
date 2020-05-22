import java.util.Random;
import java.util.Scanner;

class Ex6_9{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("—v‘f”:");
		int n = stdIn.nextInt();
		int [] a = new int[n];
		
		for( int i = 0; i<n; i++){
			a[i] = 1 + rand.nextInt(10);
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}
		
		
		