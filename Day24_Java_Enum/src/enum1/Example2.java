package enum1;

public class Example2 {

	 enum Margin{
		 TOP,BOTTOM,LEFT,RIGHT,sunil,sandeep
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		for(Margin m:Margin.values()) {
			System.out.printf("Margin %d=%s\n",count++,m);
		}
	}

}
