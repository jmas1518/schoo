import java.util.Scanner;
class Ex6_6{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("人数を入力せよ:");
		int ninzu = stdIn.nextInt();
		int[] tensu = new int[ninzu];
		int sum = 0;
		
		System.out.println(ninzu+"人の点数を入力せよ。");
		for (int i = 0;i<ninzu;i++){
			System.out.print((i+1)+"番の点数:");
			tensu[i] = stdIn.nextInt();
			sum += tensu[i];
		}
		int max = tensu[0];
		int min = tensu[0];
		
		for(int i = 1; i < tensu.length; i++){
			if(tensu[i]>max){
			max =tensu[i];
			}
		}
		for(int i = 1; i < tensu.length; i++){
			if(tensu[i] <min){
				min = tensu[i];
			}
		}
		System.out.println("合計点は"+sum+"です。");
		System.out.println("平均点は"+(double)(sum/ninzu)+"です。");
		System.out.println("最高点は"+max+"点です。");
		System.out.println("最低点は"+min+"点です。");
	}
}
		
	