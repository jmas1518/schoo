import java.util.Scanner;

class Ex4_21_2{
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�E�㒼�p�O�p�`��\�����܂��B");
		System.out.print("�i����:");
		int n = stdIn.nextInt();
		int k = 0;
		
		for (int i = 0; i < n; i++){
			for( k = 0; k < i;k++){
				System.out.print(" ");
			}
			for (int j = 0; j < n-k; j++){ 
					System.out.print('*');
			}
			System.out.println();
		}		
	}
}

