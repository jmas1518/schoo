import java.util.Scanner;

class Ex4_26{
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���������Z���܂��B");
		System.out.println("�����Z���܂���:");
		int n = stdIn.nextInt();		//���Z�����
		
		int sum = 0;	//���v�l
		int count =0;    //��
		for (int i = 0; i < n; i++){
			System.out.print("����(0�ŏI��) :");
			int t = stdIn.nextInt();
			if (t < 0) {
				System.out.println("���̐��͉��Z���܂���B");
				continue;
			}
			sum += t;
			count = count +1;
		}
		System.out.println("���v��"+sum+"�ł��B");
		System.out.println("���ς�"+sum/count+"�ł��B");
	}
}