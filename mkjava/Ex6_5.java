import java.util.Scanner;

class Ex6_5{
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("óvëfêî:");
		int n = stdIn.nextInt();
		int [] a = new int[n];
		int i =0;
		for( i = 0; i<n; i++){
			System.out.print("a["+i+"]=");
			a[i] = stdIn.nextInt();
		}
		for(i =0 ; i<n ; i++){
			if(i==0){
					System.out.print("a={");
			}
			if(i != n){
				
			System.out.print(a[i]+",");
			}
		}
		System.out.print("}");
	}
}