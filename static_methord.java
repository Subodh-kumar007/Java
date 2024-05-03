/*static methord is a class methord that reflect change hole class
static methord work on only static variable. it is give error for work non-static variable.
we use "static" keyword for make static variable 
we invoke static methor in 2 ways
1. through object
	ex:- ob1.showVlaue();
2. through class name
	ex:- teststaticM.showVlaue();

*/

import java.util.*;
class teststaticM
{
	int a;   //instance variable
	static int b;    //class variable
	void inputData(int m)
	{
		a=m;
		b++;

	}
	void showData()  //instance methord
	{
		System.out.println("value of a:- "+a);
		System.out.println("value of b:- "+b);
	}
	static void showValue()  //class methord
	{
		//System.out.println("value of a:- "+a); /*this line will give error because methord is static and variable is non-static */
		System.out.println("value of SM b:- "+b);
	}
}
class static_methord
{
	public static void main(String[] args) 
	{
		teststaticM ob1=new teststaticM();
		ob1.inputData(10);
		ob1.showData();
		ob1.showValue();

		teststaticM ob2=new teststaticM();
		ob2.inputData(15);
		ob2.showData();
		teststaticM.showValue();

		ob1.showData();
	}
}