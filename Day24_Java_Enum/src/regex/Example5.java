package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Example5 {

	private static  String regex="Sunil";
	private static String str="I love Sunil "+" Sunil is famous for oranges";
	private static String replace =" Giridih";
	public static void main(String[] args) {
		try {
			Pattern p=Pattern.compile(regex);
			Matcher m=p.matcher(str);
			str=m.replaceAll(replace);
			System.out.println(str);
		}
		catch(PatternSyntaxException e) {
			System.out.println("Pattrn Syntax Exception: "+e.getDescription());
			System.out.println("Index: "+e.getIndex());
			System.out.println("Message: "+e.getMessage());
		}
	}
}
