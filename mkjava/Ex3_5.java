import java.util.Scanner;
class Ex3_5{
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("�����l:");
	int n = stdIn.nextInt();
	
	if  (n<=0)
		System.out.println("���łȂ��l�����͂���܂����B");
		
	else if(n%5==0)
		System.out.println("���̒l��5�Ŋ���؂�܂��B");
	
	else if (n%5!=0)
		System.out.println("���̒l��5�Ŋ���؂�܂���B");
	
		}
		}