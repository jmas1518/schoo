import java.util.Random;
import java.util.Scanner;

class Ex6_7{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		final int n = 12;
		int[] a = new int[n];
		
		for(int j = 0; j<n; j++){
			a[j] = rand.nextInt(10);
		}
		
		System.out.print("�z��̑S�v�f�̒l\n{");
		for(int j = 0; j<n; j++){
			System.out.print(a[j] + " ");
		}
		System.out.println("}");
		
		System.out.print("�T�����l:");
		int key = stdIn.nextInt();
		
		int i;
		for(i = 11; i> 0; i--){
			if(a[i] == key)
				break;
		}
		if(i>0){
			System.out.println("�����a["+i+"]�ɂ���܂��B");
		}else{
			System.out.println("����͂���܂���B");
		}
	}
}

			
		
