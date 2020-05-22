package mkjava1;

public class TimeAccount extends Account   {

	private long timeBalnce;		//預金残高

	TimeAccount(String n, String num, long z,long y) {
		super(n, num, z);
		this.timeBalnce = y;
		// TODO 自動生成されたコンストラクター・スタブ
	}
	//定期預金残高を調べる
	long getTimeBalance() {
		return timeBalnce;
	}

}

