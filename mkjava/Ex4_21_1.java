import java.util.Scanner;

class Ex4_21_1{
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���㒼�p�O�p�`��\�����܂��B");
		System.out.print("�i����:");
		int n = stdIn.nextInt();
		
		for (int i = 1; i <= n; i++){
			for (int j = n; j >=i; j--){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}