import java.util.Scanner;
class Ex3_8{
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
		System.out.print("点数を評価します。\n点数は");
	int x = stdIn.nextInt();
	
	if(0<=x && x<=59)
		System.out.println("不可");
	else if(60<=x && x<=69)
		System.out.println("可");
	else if(70<=x && x<=79)
		System.out.println("良");
	else if(80<=x && x<=100)
		System.out.println("優");
		}
		}