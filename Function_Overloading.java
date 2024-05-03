/* A function is declayerd with same name and more than 2 function is called function overloading
we differntsiat the function argumentshould differ 
1. argument count
2.argument type
->static function hoga to class se invoke hoga
	ex:- figure.area(10,20);
->without static function object se invoke hoga
	ex:- ob1.area(10,30);
*/
import java.util.*;
class figure
{
	void area(int a,int b) 
	{
		int c=a*b;
		System.out.println("area of rectangle:- "+c);
	}
	void area(int n)
	{
		int s=n*n;
		System.out.println("area of squer:- "+s);
	}
	void area(double b)
	{
		double c=3.14*(b*b);
		System.out.println("area of circle:- "+c);	
	}
}
class Function_Overloading
{
	public static void main(String[] args) 
	{		
		figure ob1=new figure(); 
		ob1.area(10,20);
		ob1.area(15);
		ob1.area(5.5);   
	}
}