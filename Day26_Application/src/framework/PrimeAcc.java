package framework;

public abstract class PrimeAcc extends ShopAcc
{
static boolean isPrime;
private static final float deliveryCharges=0.0f;

public PrimeAcc(int AccNo, String AccNm,float Charges,boolean isPrime)
{
	super(AccNo,AccNm,Charges);
	
	//this.isPrime = isPrime;
	this.isPrime=isPrime;

}

public void bookProduct(float charges) {
	System.out.println("Account no is "+this.getAccNo()+"   Account name is   "+this.getAccNm()+ "  "+"charge is "+charges);
	
}
@Override
public String toString() {
	return String.format("PrimeAcc [isPrime=%s, toString()=%s]", isPrime,
			super.toString());
}


}
