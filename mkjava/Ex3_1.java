import java.util.Scanner;
class Ex3_1{
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("�����l:");
	int x = stdIn.nextInt();
	
	if(x>0)
		System.out.println("���̐�Βl��"+x+"�ł��B");
		
	else
		System.out.println("���̐�Βl��"+x*(-1)+"�ł��B");
		}
		}