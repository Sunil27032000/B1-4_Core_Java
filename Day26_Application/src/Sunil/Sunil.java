package Sunil;

import Application.GSNormalAcc;
import Application.GSPrimeAcc;
import Application.GSShopeFactory;
import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class Sunil {

	public static void main(String[] args) {
		ShopFactory s=new GSShopeFactory();
		PrimeAcc p=new GSPrimeAcc(123,"Sunil Kumar",250,true);
		NormalAcc n=new GSNormalAcc(124,"Sandeep",300,10);
		System.out.println("Prime account ");
		p.bookProduct(PrimeAcc.getCharge());
		System.out.println("Normal account");
		n.bookProduct(NormalAcc.getCharges());
		System.out.println(s.getNewPrimeAccount(1, "Sanjay", 1236, true));
		System.out.println(s.getNewNormalAcc(800, "", 1000, 50));

		System.out.println(p);
		System.out.println(n);
		}

}
