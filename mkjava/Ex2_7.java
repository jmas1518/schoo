import java.util.Random;
class Ex2_7{
	public static void main(String[] args){
	Random rand = new Random();
	
	int x = rand.nextInt(9);
	int y = rand.nextInt(90);
	
	System.out.println(x+1);
	System.out.println(x*(-1)-1);
	System.out.println(y+10);
	}
}