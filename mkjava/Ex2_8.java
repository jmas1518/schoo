import java.util.Random;
import java.util.Scanner;
class Ex2_8{
	
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int y = rand.nextInt(11);
		
		System.out.print("�����l:");
		int x = stdIn.nextInt();
		
		System.out.println("���̒l�́}5�̗����𐶐����܂����B");
		System.out.println("�����"+(x+y-5)+"�ł��B");
		}
	}	