import java.util.Random;
import java.util.Scanner;

class Ex6_11{
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�v�f��:");
		int n = stdIn.nextInt();
		int [] a = new int[n];
		
		//a[0] = 1+rand.nextInt(10);
		//System.out.println("a[0]="+a[0]);
		
		for( int i = 0; i<n; i++){
			a[i] = 1 + rand.nextInt(10);			//i�Ԗڂ̗v�f�������_���Ő���
	
			for(int j = 0; j<n;j++){				//�T�����ē������̂����O������
				int key = a[j];						//key�l���J��Ԃ���			
				do{
					
					a[j] = 1 + rand.nextInt(10);
					break;
				}while(a[i]==a[j]);
				
			}
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}