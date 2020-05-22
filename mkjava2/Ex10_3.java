package mkjava1;

public class Ex10_3 {
	//2値の最小値
	public static int min2(int a,int b) {
		if(a<b) {
			return a;
		}else {
			return b;
		}
	}
	//3値の最小値
	public static int min3(int a,int b,int c) {
		int min =a;
		if(min>b) {
			min =b;
		}if(min>c) {
			min =c;
		}
		return min;
	}
	//配列の最小値
	public static int minOf(int [] a) {
		int min =a[0];
		for(int i = 1; i<a.length; i++)
			if(a[i]<min) {
				min = a[i];
			}
		return min;
	}
	//2値の最大値
	public static int max2(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	//3値の最大値
	public static int max3(int a,int b,int c) {
		int max =a;
		if(max<b) {
			max =b;
		}if(max<c) {
			max =c;
		}
		return max;
	}
	//配列の最大値
	public static int maxOf(int [] a) {
		int max =a[0];
		for(int i = 1; i<a.length; i++)
			if(a[i]>max) {
				max = a[i];
			}
			return max;
		}
}
