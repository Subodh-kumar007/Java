/*static variable is a class variable that reflect change hole class
by default static variable value is 0 . we use "static" keyword for make static variable */

import java.util.*;
class teststatic
{
	int a;   //instance variable
	static int b;    //class variable
	void input(int m)
	{
		a=m;
		b++;

	}
	void show()
	{
		System.out.println("value of a:- "+a);
		System.out.println("value of b:- "+b);
	}
}
class static_variable
{
	public static void main(String[] args) 
	{
		teststatic ob1=new teststatic();
		ob1.input(10);
		ob1.show();

		teststatic ob2=new teststatic();
		ob2.input(15);
		ob2.show();

		ob1.show();
	}
}