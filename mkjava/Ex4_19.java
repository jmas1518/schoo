import java.util.Scanner;

class Ex4_19{
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int  retry;		//
		int month;
		
		do{
			do{
			System.out.print("�G�߂����߂܂��B\n�����ł���:");
			month = stdIn.nextInt();
			}while(1 > month || month >12);
			
			if (month >= 3 && month <= 5){
				System.out.println("����͏t�ł��B");
			}else if (month >= 6 && month <= 8){
					System.out.println("����͉Ăł��B");
			}else if (month >= 9 && month <=11){
					System.out.println("����͏H�ł��B");
			}else if (month ==12 || month == 1 || month == 2){
					System.out.println("����͓~�ł��B");
			}	
				System.out.print("������x? 1�cYes/0�cNo:");
				retry = stdIn.nextInt();
			}while (retry == 1);
		}
	}


				
			