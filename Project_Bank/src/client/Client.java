package client;

import Apllication.MMBankFactory;
import Apllication.MMCurrentAcc;
import Apllication.MMSavingAcc;
import framework.BankFactory;
import framework.CurrentAcc;
import framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		
		BankFactory B=new MMBankFactory();
		SavingAcc S=new MMSavingAcc(true,450,"Sunil",4000);
		CurrentAcc C=new MMCurrentAcc(456,"Sandeep",450,500);
		System.out.println("Saving Account:  ");
		S.withdraw(S.getAccBal());
		System.out.println("Current Account:  ");
		C.withdraw(C.getAccBal());
		System.out.println(B.getNewSavingAcc(123, "Ajay", 785, false));
		System.out.println(B.getNewCurrentAcc(458, "Sanjay", 450, 456));
		
		System.out.println(S);
		System.out.println(C);
	}

}
