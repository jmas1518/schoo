import java.util.Scanner;

class Ex2_5{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("x�̒l:");
		double a = stdIn.nextDouble();
		
		System.out.print("y�̒l:");
		double b = stdIn.nextDouble();
		
		System.out.println("���v��"+(a+b)+"�ł��B");
		System.out.println("���ς�"+(a+b)/2+"�ł��B");
				}
	}