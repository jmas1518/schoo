class Ex5_7{
	
	public static void main(String[] args){
		float x ;
		int i ;
		
		System.out.println("’l"+"         "+"’l‚Ì2æ");
		System.out.println("-------------------------");
		for ( x = 0.0F ; x<= 1.0F ; x += 0.001F){
			float y = x*x;
			System.out.printf("%1.7f %1.14f",x,y);
			System.out.println();
		
		}	
	}
}