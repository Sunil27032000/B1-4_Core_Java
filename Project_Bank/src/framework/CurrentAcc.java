package framework;

public abstract class CurrentAcc extends BankAcc{

	private float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
	}

public void withdraw(float MINBAL) {
	System.out.println("Account no is: "+this.getAccNo()+"   Account Name is:   "+this.getAccNm()+ "  "+"Account Bal: "+  (getAccBal()+creditLimit));
}

@Override
public String toString() {
	return String.format("CurrentAcc [creditLimit=%s]", creditLimit,super.toString());
}
	
	
} 
