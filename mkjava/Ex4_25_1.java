import java.util.Scanner;

class Ex4_25_1{
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("整数を加算します。");
		System.out.println("何個加算しますか:");
		int n = stdIn.nextInt();		//加算する個数
		
		int sum = 0;	//合計値
		int count =0;    //回数
		for (int i = 0; i < n; i++){
			System.out.print("整数(0で終了) :");
			int t = stdIn.nextInt();
			if (t == 0) break;
			sum += t;
			count = count +1;
		}
		System.out.println("合計は"+sum+"です。");
		System.out.println("平均は"+sum/count+"です。");
	}
}
		