import java.util.Scanner;
class Ex3_18{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("��������͂��Ă��������B:"); int x = stdIn.nextInt();
		
		switch (x){
		case 1 :System.out.println("�~");	break;
		case 2 :System.out.println("�~");	break;
		case 3 :System.out.println("�t");	break;
		case 4 :System.out.println("�t");	break;
		case 5 :System.out.println("�t");	break;
		case 6 :System.out.println("��");	break;
		case 7 :System.out.println("��");	break;
		case 8 :System.out.println("��");	break;
		case 9 :System.out.println("�H");	break;
		case 10 :System.out.println("�H");	break;
		case 11 :System.out.println("�H");	break;
		case 12 :System.out.println("�~");	break;
		
		
		default  :System.out.println("�悭�킩��܂���B");	break;
		}
	}
}
		