class Ex5_6{
	
	public static void main(String[] args){
		float x ;
		int i ;
		
		System.out.println("float"+"         "+"int");
		System.out.println("-------------------------");
		for ( x = 0.0F , i = 0; x<= 1.0F && i <= 1000; x += 0.001F,i+=1){
			float y = (float)i / 1000;
			System.out.printf("%8.7f %8.7f",x,y);
			System.out.println();
		
		}	
	}
}