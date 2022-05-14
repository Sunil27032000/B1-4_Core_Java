package framework;

public abstract class ShopFactory 
{
public 	abstract PrimeAcc getNewPrimeAccount(int AccNo, String AccNm,float Charges,boolean isPrime);
public	abstract NormalAcc getNewNormalAcc(int AccNo, String AccNm,float Charges,float deliveryCharges);

}
