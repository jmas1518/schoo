import java.util.Random;
import java.util.Scanner;

class Ex6_4{
	
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("óvëfêî:");
		int n = stdIn.nextInt();
		int [] a = new int[n];
		
		
		
		for(int i = 0; i<n; i++){
			a[i] = 1+rand.nextInt(10);
		}
		
		for(int i=10;i>0;i--){ 
			for(int j=0;j<n;j++){ 
				if(i <= a[j]){ 
					System.out.print('*'); 
				} else{
					System.out.print(' '); 
				}
				System.out.print(' '); 	
			} 
			System.out.println(); 
		} 
		System.out.println("--------------------------------"); 
		
		for(int i=0;i<n;i++){ 
			System.out.print(i%10); 
			System.out.print(' '); 
		} 
		System.out.println(); 
	} 
} 