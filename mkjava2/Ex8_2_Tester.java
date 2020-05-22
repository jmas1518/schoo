package mkjava1;
import java.util.Scanner;

public class Ex8_2_Tester {

	public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);

	System.out.println("車のデータを入力せよ");
	System.out.print("名前は:");		String name = stdIn.next();
	System.out.print("車幅は:");			int width = stdIn.nextInt();
	System.out.print("高さは:");			int height = stdIn.nextInt();
	System.out.print("長さは:");			int length = stdIn.nextInt();
	System.out.print("ガソリン量を:");			double fuel = stdIn.nextDouble();
	System.out.print("ナンバーは:");			int num = stdIn.nextInt();

	Car myCar = new Car(name,width,height,length,fuel,num);
	myCar.putSpec();
	myCar.Kuruma();
	}
}
