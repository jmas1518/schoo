import java.util.Random;
import java.util.Scanner;

class Ex4_2{

	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(90)+10;
		
		System.out.println("�����ăQ�[���J�n!!");
		System.out.println("10�`99�̐��𓖂ĂĂ��������B");
		
		int x;
		do{
			System.out.print("��������:");
			x = stdIn.nextInt();
			
			if(x>no)
				System.out.println("�����Ə�����������B");
			else if (x <no)
				System.out.println("�����Ƒ傫�Ȑ�����B");
			}while(x != no);
		System.out.println("�����ł��B");
		}
}