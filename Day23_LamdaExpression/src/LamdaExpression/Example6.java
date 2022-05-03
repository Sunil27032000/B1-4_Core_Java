package LamdaExpression;
interface D
{
	int mul(int x,int y);
}

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj=(x,y)->(x*y);
		System.out.println(obj.mul(20, 30));
	}

}
