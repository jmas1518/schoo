import java.util.Scanner;
class Ex3_6{
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("�����l:");
	int n = stdIn.nextInt();
	
	if   (n<=0)
		System.out.println("���łȂ��l�����͂���܂����B");
		
	else if (n%10==0)
		System.out.println("���̒l��10�̔{���ł��B");
	
	else if (n%10!=0)
		System.out.println("���̒l��10�̔{���ł͂���܂���B");
	
	
		}
		}