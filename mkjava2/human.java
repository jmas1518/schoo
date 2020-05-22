package mkjava1;
//人間クラス
public class human {
	private String name;
	private int height;
	private int weight;
	
	//コンストラクタ
	human(String n, int h, int w){
		name = n;
		height = h;
		weight = w;
	}
	void putInf() {
		System.out.println("名前:"+name);
		System.out.println("身長:"+height);
		System.out.println("体重:"+weight);
		//System.out.println("名前:"+name);
	}
}