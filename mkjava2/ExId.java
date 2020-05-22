package mkjava1;

public class ExId {
	static int counter = 0;
	static int n =1;

	private int id;


	public ExId(int n) {
		id +=n;
		counter = id;
		

	}
	public ExId() {
		id = ++counter;
	}
	

	public int getId() {
		return n;
	}
	static public int getMaxId(){

		return counter;
	}


}


