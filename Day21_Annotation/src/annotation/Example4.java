package annotation;

import java.lang.reflect.Method;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation1 {
	
	int value();
	
}
class Parent2
{	
	@MyAnnotation1(value=25)
	public void display()
	{
		System.out.println("Welcome to annotations");
	}
}

public class Example4 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Parent2 p=new Parent2();
		Method m=p.getClass().getMethod("display");
		MyAnnotation1 a=m.getAnnotation(MyAnnotation1.class);
		System.out.println(a.value());
	}

}
