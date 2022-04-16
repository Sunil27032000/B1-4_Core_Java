package strings;

public class Example17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Racky");
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		sb.setCharAt(1,'o');
		System.out.println(sb);
		System.out.println(sb.charAt(1));
}
}