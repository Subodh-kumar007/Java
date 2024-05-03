/* This keyword is use to make defrance between class and local variable. 
some times the class variable and the local variable have the same name 
in this sichuation class variable is alway hiden by local variable. 
to overcome this problem keyword "this" is use.
*/
import java.util.*;
class TestThis
{
	int a; //instance variable
	int b;
	TestThis(int a,int b)  //paramterized constructor defination
	{
		this.a=a;
		this.b=b;
	}

	void showOutput()
	{
		System.out.println("value of a:- "+a);
		System.out.println("value of b:- "+b);
	}
}
class This_keyword
{
	public static void main(String[] args) 
	{
		Scanner S=new Scanner(System.in);
		int a,b;
		System.out.println("enter the values:-");
		a=S.nextInt();
		b=S.nextInt();
		TestThis T=new TestThis(a,b);  //paramterized constructor
		//constructor invoked
		T.showOutput();

	}
}