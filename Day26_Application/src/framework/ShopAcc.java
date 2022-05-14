package framework;

public abstract class ShopAcc {

	private static int AccNo;
	private static String AccNm;
	private static float Charges;
	
	public ShopAcc(int accNo, String accNm, float charges) {
		ShopAcc.AccNo = accNo;
		ShopAcc.AccNm = accNm;
		ShopAcc.Charges = charges;
	}
	
	public abstract void bookProduct (float Charges) ;
	public abstract void items(float Charges) ;

	public static int getAccNo() {
		return AccNo;
	}


	public static String getAccNm() {
		return AccNm;
	}

	public static void setAccNm(String accNm) {
		AccNm = accNm;
	}

	public static float getCharges() {
		return Charges;
	}

	public static float getCharge() {
		return Charges;
	}

	@Override
	public String toString() {
		return String.format("ShopAcc [toString()=%s]", super.toString());
	}

}
