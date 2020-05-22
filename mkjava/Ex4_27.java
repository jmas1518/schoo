import java.util.Random;
import java.util.Scanner;

class Ex4_27{

	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(100);
		
		System.out.println("数あてゲーム開始!!");
		System.out.println("0～99の数を当ててください。");
		
		int n = rand.nextInt(5)+5;
		int x = 0;
		
		System.out.println("解答制限は"+n+"回です。");
		
		for(int i = 0; i < n; i++){
			
			System.out.print("いくつかな:");
			x = stdIn.nextInt();
			if(x>no){
				System.out.println("もっと小さい数だよ。");
			}
			 if (x <no){
				System.out.println("もっと大きな数だよ。");
			}
			 if (x == no){
				
				break ;
			}
		}
		if(x == no){
			System.out.println("正解です。");
		}else{
			System.out.println("正解は"+ no +"です。");
		}
	}
}