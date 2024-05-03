/* A constructor is declayerd with same name with the class name and 
more than 2 constructor is called constructor overloading
we differntsiat the constructor argumentshould differ 
1. argument count
2.argument type

*/
import java.util.*;
class testcons
{
	testcons(int a,int b) 
	{
		int c=a*b;
		System.out.println("area of rectangle:- "+c);
	}
	testcons(int n)
	{
		int s=n*n;
		System.out.println("area of squer:- "+s);
	}
	testcons(double b)
	{
		double c=3.14*(b*b);
		System.out.println("area of circle:- "+c);	
	}
	testcons()
	{
		int a;
		a=12;
		System.out.println("value of a:- "+a);	
	}
}
class Constructor_Overloading
{
	public static void main(String[] args) 
	{		
		testcons ob1=new testcons(10,20); //perametrised constructor
		testcons ob2=new testcons(15);
		testcons ob3=new testcons(5.5);  
		testcons ob4=new testcons();  //Non perametrised constructor
	}
}