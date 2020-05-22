class Ex6_2{
	public static  void main(String[] args){
		int [] a = new int [5];
		int b = 5;
		
		for(int i = 0; i<a.length; i++){
			a[i] =b;
			b--;
		}
		for(int i = 0; i<=4 ; i++){
			System.out.println("a["+i+"]=" + a[i]);
		}
	}
}                       