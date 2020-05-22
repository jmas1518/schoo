import java.util.Random;
import java.util.Scanner;
class Ex2_8{
	
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int y = rand.nextInt(11);
		
		System.out.print("整数値:");
		int x = stdIn.nextInt();
		
		System.out.println("その値の±5の乱数を生成しました。");
		System.out.println("それは"+(x+y-5)+"です。");
		}
	}	