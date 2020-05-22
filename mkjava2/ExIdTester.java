package mkjava1;

public class ExIdTester {
	public static void main(String[] args) {
		int n = 4;
		
		ExId a = new ExId();
		ExId b = new ExId();
		ExId c = new ExId();
		ExId d = new ExId(n);
		ExId e = new ExId();
		ExId f = new ExId();
		
		
		
		
		System.out.println("aの識別番号:"+a.getId());
		System.out.println("aの識別番号:"+b.getId());
		
		System.out.println("Id.counter ="+Id.counter);
		System.out.println("a.counter ="+a.counter);
		System.out.println("b.counter ="+b.counter);
		System.out.println("c.counter ="+c.counter);
		System.out.println("d.counter ="+d.counter);
		System.out.println("e.counter ="+e.counter);
		System.out.println("f.counter ="+f.counter);
		System.out.println("識別番号数は"+Id.getMaxId());
	}
}

