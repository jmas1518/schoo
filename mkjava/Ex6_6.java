import java.util.Scanner;
class Ex6_6{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�l������͂���:");
		int ninzu = stdIn.nextInt();
		int[] tensu = new int[ninzu];
		int sum = 0;
		
		System.out.println(ninzu+"�l�̓_������͂���B");
		for (int i = 0;i<ninzu;i++){
			System.out.print((i+1)+"�Ԃ̓_��:");
			tensu[i] = stdIn.nextInt();
			sum += tensu[i];
		}
		int max = tensu[0];
		int min = tensu[0];
		
		for(int i = 1; i < tensu.length; i++){
			if(tensu[i]>max){
			max =tensu[i];
			}
		}
		for(int i = 1; i < tensu.length; i++){
			if(tensu[i] <min){
				min = tensu[i];
			}
		}
		System.out.println("���v�_��"+sum+"�ł��B");
		System.out.println("���ϓ_��"+(double)(sum/ninzu)+"�ł��B");
		System.out.println("�ō��_��"+max+"�_�ł��B");
		System.out.println("�Œ�_��"+min+"�_�ł��B");
	}
}
		
	