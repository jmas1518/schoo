import java.util.Scanner;
class Ex3_14{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a:"); int a = stdIn.nextInt();
		System.out.print("����b:"); int b = stdIn.nextInt();
		
		int max ;
		int min ;
		
		if ( a < b ){
			max = b;
			min = a;
		}else{ 
			max = a;
			min = b;
		}
		if  (a == b){
			System.out.println("��̒l�͓����ł��B");
		}else{
			System.out.println("�傫���ق���"+max);
			System.out.println("�������ق���"+min);
		}
		
		}
		}