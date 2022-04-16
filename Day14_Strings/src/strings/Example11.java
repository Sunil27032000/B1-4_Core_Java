package strings;

public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
	System.out.println(sb.capacity());
	sb.append("Good");
	System.out.println(sb.capacity());
	sb.append("Java Is My Favourite Language");
	System.out.println(sb.capacity());
	}

}
