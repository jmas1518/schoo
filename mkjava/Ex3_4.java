import java.util.Scanner;
class Ex3_4{
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("整数a:");
	int a = stdIn.nextInt();
	
	System.out.print("整数b:");
	int b = stdIn.nextInt();
	
	if(a>b)
		System.out.println("aのほうが大きいです。");
		
	else if(a<b)
		System.out.println("bのほうが大きいです。");
	else if(a==b)
		System.out.println("aとbは同じ値です。");
		}
		}