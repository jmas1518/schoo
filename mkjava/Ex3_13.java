import java.util.Scanner;
class Ex3_13{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("®”a:"); int a = stdIn.nextInt();
		System.out.print("®”b:"); int b = stdIn.nextInt();
		System.out.print("®”c:"); int c = stdIn.nextInt();
		
		int mid  ;
		if (a>b && a<c || a>c && a<b || a==b || a==c){
			mid = a;
		}else if (b>a && b<c || b>c && b<a ||b==a || b==c ){
			mid = b;
		}else{
			mid = c;
		}
		System.out.println("’†‰›’l‚Í"+mid+"‚Å‚·B");
		
		
		}
		} 