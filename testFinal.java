/* Final keyword make variable value is constant that meains we could not change value. 
we try to change value it will give error.
*/
import java.util.*;
class Finalex
{
	int a; //instance variable
	final int b=6;  //instance variable (final--constant)
	int c=20;
	void readInput(int m,int n)
	{
		a=m;
		c=n;
	}
	void showOutput()
	{
		System.out.println("value of a:- "+a);
		System.out.println("value of b:- "+b);
		System.out.println("value of c:- "+c);
	}
}
class testFinal
{
	public static void main(String[] args) 
	{
		Finalex F=new Finalex();
		F.readInput(10,30);
		F.showOutput();

		Finalex f2=new Finalex();
		f2.showOutput();
	}
}