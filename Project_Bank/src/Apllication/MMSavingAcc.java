package Apllication;

import framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{

	public MMSavingAcc(boolean isSalaried, int accNo, String accNm, float accBal) {
		super(isSalaried, accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return String.format("MMSavingAcc [toString()=%s]", super.toString());
	}


	@Override
	public void deposite(float accBal) {
		// TODO Auto-generated method stub
		
	}

}
