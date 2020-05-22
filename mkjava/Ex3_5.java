import java.util.Scanner;
class Ex3_5{
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("整数値:");
	int n = stdIn.nextInt();
	
	if  (n<=0)
		System.out.println("正でない値が入力されました。");
		
	else if(n%5==0)
		System.out.println("その値は5で割り切れます。");
	
	else if (n%5!=0)
		System.out.println("その値は5で割り切れません。");
	
		}
		}