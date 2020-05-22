class Ex6_3{
	public static  void main(String[] args){
		double [] a = new double [5];
		double b = 1.1;
		
		for(int i = 0; i<a.length; i++){
			a[i] =b;
			b = b+1.1;
		}
		for(int i = 0; i<=4 ; i++){
			System.out.printf("a["+i+"]= %2.1f",a[i]);
			System.out.println();
		}
	}
