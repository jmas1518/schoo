import java.util.Random;
import java.util.Scanner;

class Ex4_27{

	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(100);
		
		System.out.println("�����ăQ�[���J�n!!");
		System.out.println("0�`99�̐��𓖂ĂĂ��������B");
		
		int n = rand.nextInt(5)+5;
		int x = 0;
		
		System.out.println("�𓚐�����"+n+"��ł��B");
		
		for(int i = 0; i < n; i++){
			
			System.out.print("��������:");
			x = stdIn.nextInt();
			if(x>no){
				System.out.println("�����Ə�����������B");
			}
			 if (x <no){
				System.out.println("�����Ƒ傫�Ȑ�����B");
			}
			 if (x == no){
				
				break ;
			}
		}
		if(x == no){
			System.out.println("�����ł��B");
		}else{
			System.out.println("������"+ no +"�ł��B");
		}
	}
}