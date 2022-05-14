package framework;

public abstract class NormalAcc extends ShopAcc
{
	private float deliveryCharges;
	
	public NormalAcc(int AccNo, String AccNm,float Charges,float deliveryCharges) {
		super(AccNo,AccNm,Charges);
		
	this.deliveryCharges=deliveryCharges;
		
	}
	public void bookProduct(float charges) 
	{
		System.out.println("Account no is "+this.getAccNo()+"   Account Name is   "+this.getAccNm()+ "  "+"charge is "+  (charges+deliveryCharges));
	}
	@Override
	public String toString()
	{
		return String.format("NormalAcc [deliveryCharges=%s]", deliveryCharges,super.toString());
	}
	
}
