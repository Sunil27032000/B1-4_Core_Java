package package3;

public class SBI {

public int balance;
public SBI (int bal){
	balance=bal;
}
 public void display() {
	System.out.println(balance);
}
public static void main(String args[]) {
	SBI s=new SBI(785620);
	s.display();
}

}
