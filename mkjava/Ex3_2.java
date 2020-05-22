import java.util.Scanner;
class Ex3_2{
	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	
	System.out.print("®”A:");
	int x = stdIn.nextInt();
	
	System.out.print("®”B:");
	int y = stdIn.nextInt();
	
	if((x % y)==0)
		System.out.println("B‚ÍA‚Ì–ñ”‚Å‚·B");
		
	else
		System.out.println("B‚ÍA‚Ì–ñ”‚Å‚Í‚ ‚è‚Ü‚¹‚ñB");
		}
		}