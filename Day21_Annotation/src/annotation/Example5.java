package annotation;

import java.lang.reflect.Method;
import java.lang.annotation.*;
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Children {
	
	int value();
	
}
//@interface Happy{}
class people
{	
	@MyAnnotation1(value=102112)
	public void display()
	{
		System.out.println("Welcome to annotations");
	}
}
class Soujan extends Parent2
{	
	public static void main(String args[]) throws Exception
	{
		Parent2 p=new Parent2();
		Method m=p.getClass().getMethod("display");
		MyAnnotation1 a=m.getAnnotation(MyAnnotation1.class);
		System.out.println(a.value());
	}

}
