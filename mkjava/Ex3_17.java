import java.util.Random;
class Ex3_17{
	public static void main(String[] args){
	Random rand = new Random();
	
	int x = rand.nextInt(3);
	
	switch (x){
	 case 0 :System.out.println("�O�[");	break;
	 case 1 :System.out.println("�`���L");	break;
	 case 2 :System.out.println("�p�[");	break;
	 }
	}
}