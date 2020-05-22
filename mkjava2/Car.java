package mkjava1;

import java.util.Scanner;

public class Car {
	Scanner stdIn = new Scanner(System.in);
	 private String name;
	 private int width;
	 private int height;
	 private int length;
	 private double x;
	 private double y;
	 private double fuel;
	 private int num;

	//コンストラクタ
	Car(String name, int width, int height, int length, double fuel,int num){
		this.name =  name;		this.width = width;		this.height = height;
		this.length = length;	this.fuel = fuel; 		this.num = num;
	}

	double getX() {return x;}
	double getY() {return y;}
	double getFuel() {return fuel;}

	//スペックを表示
	void putSpec() {
		System.out.println("名前:"+name);
		System.out.println("車幅:"+width+"mm");
		System.out.println("車高:"+height+"mm");
		System.out.println("車長:"+length+"mm");
		System.out.println("ナンバー:"+num);

	}



	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx*dx + dy*dy);

		if (dist > fuel)
			return false;
		else {
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}
	}
	void Kuruma() {
		while (true) {
			System.out.println("現在地("+getX()+","+getY()+")・残り燃料"+getFuel());
			System.out.println("移動しますか[0…N/1…Yes]:");
			if (stdIn.nextInt() == 0)break;

			System.out.print("X方向の移動距離:");
			double dx = stdIn.nextDouble();
			System.out.print("Y方向の移動距離:");
			double dy = stdIn.nextDouble();

			if(!move(dx, dy))
				System.out.println("燃料が足りません!");

			if(Kyu(getFuel()))
				System.out.println("あと少しでなくなります。");
		}
	}
	boolean Kyu(double fuel) {
		return (fuel<5) ;

	}
}
