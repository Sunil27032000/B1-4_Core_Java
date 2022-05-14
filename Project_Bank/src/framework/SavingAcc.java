package framework;

public abstract class SavingAcc extends BankAcc 
{
	@SuppressWarnings("unused")
	private static boolean isSalaried;

	@SuppressWarnings("unused")
	private static final float MINBAL = 0.0f;
	
	public SavingAcc(boolean isSalaried,int accNo,String accNm,float accBal) {
		super(accNo,accNm,accBal);
		SavingAcc.isSalaried = isSalaried;
		
	}

	public void withdraw(float accBal) {
		System.out.println("Account no is: "+this.getAccNo()+"   Account name is:  "+this.getAccNm()+ "  "+"Account Bal: "+accBal);
		
	}

	@Override
	public String toString() {
		return String.format("SavingAcc [toString()=%s]", super.toString());
	}

}

