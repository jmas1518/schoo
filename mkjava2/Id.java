package mkjava1;

class Id {
	static int counter = 0;
	static int n =0;

	private int id;


	public Id() {
		counter +=1;
		id = counter;

	}

	public int getId() {
		return id;
	}
	static public int getMaxId(){

		return counter;
	}


}
