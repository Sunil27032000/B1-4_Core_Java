package Apllication;

import framework.*;


public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc S=new MMSavingAcc(isSalaried,accNo,accNm,accBal);
		return S;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc C=new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		return C;
	}

	

}
