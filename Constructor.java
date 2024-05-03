/* 1.constuctor name must be same as class name
2.constuctor invoke autometicly
3.we creat an object then pass the value is called paramterized constuctor
*/
import java.util.*;
class Testconstructor
{
	int a; //instance variable
	int b;
	Testconstructor(int m,int n)  //paramterized constuctor defination
	{
		a=m;
		b=n;
	}
	Testconstructor()  //Non paramterized constuctor defination
	{
		a=25;
		b=45;
	}

	void showOutput()
	{
		System.out.println("value of a:- "+a);
		System.out.println("value of b:- "+b);
	}
}
class Constructor
{
	public static void main(String[] args) 
	{
		Testconstructor C=new Testconstructor(10,30);  //paramterized constuctor
		//constuctor invoked
		C.showOutput();

		Testconstructor c2=new Testconstructor();  //Non paramterized constuctor
		//constuctor invoked
		c2.showOutput();
	}
}