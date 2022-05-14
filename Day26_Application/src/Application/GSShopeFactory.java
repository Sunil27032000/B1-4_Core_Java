package Application;

import framework.*;


public class GSShopeFactory extends ShopFactory
{
	
	
	@Override
	public GSPrimeAcc getNewPrimeAccount(int AccNo, String AccNm, float Charges, boolean isPrime) {
		GSPrimeAcc p=new GSPrimeAcc(AccNo,AccNm,Charges,isPrime);
		return p;
	}
	@Override
	public GSNormalAcc getNewNormalAcc(int AccNo, String AccNm, float Charges, float deliveryCharges) {
		GSNormalAcc n=new GSNormalAcc(AccNo,AccNm,Charges,deliveryCharges);
		return n;
	}

}
