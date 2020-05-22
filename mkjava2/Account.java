package mkjava1;

public class Account {
	private String name;				//口座名義
	private String no;					//口座番号
	private long balance;				//預金残高
	

	//コンストラクタ
	Account(String n, String num, long z){
		name = n;
		no = num;
		balance = z;
		
	}
	//口座名義を調べる
	String getName() {
		return name;
	}
	//口座番号を調べる
	String getNo() {
		return no;
	}
	//預金残高を調べる
	long getBalance() {
		return balance;
	}
	
	//k円預ける
	void deposita(long k) {
		balance += k;
	}
	//k円おろす
	void withdraw(long k) {
		balance -= k;
	}
	
	
}
