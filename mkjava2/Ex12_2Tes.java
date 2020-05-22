package mkjava1;

public class Ex12_2Tes {

	public static void main(String[] args) {


		Account kage = new Account("a","b",1000);
		TimeAccount adachi = new TimeAccount("c","d",500,1000);
		
		System.out.println(compMoney(adachi,kage));
		
	}

		static int compMoney(Account a, Account b) {
			long c = a.getBalance();
			if(a instanceof TimeAccount) {
				c += ((TimeAccount)a).getTimeBalance();
			}
			long d =b.getBalance();
			if(b instanceof TimeAccount) {
				d += ((TimeAccount)b).getTimeBalance();
			}
			if(c>d) {
				return 1;
			}else if(c<d) {
				return -1;
			}else {
				return 0;
			}
	}
}

