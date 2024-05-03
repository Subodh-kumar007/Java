/* Array of object with encapsulation and abstraction
with private keywork is called abstraction (data hiding)
with out private keyword we achive encapsulation (bind the data)
*/
import java.util.*;
class details
{
	private int AC,Bal;
	private String name;
	void readInput(String na,int a,int b)
	{
		AC=a;
		Bal=b;
		name=na;
	}
	void showOutput()
	{
		System.out.println("Name:- "+name+" Acount Number:- "+AC+" Balance:- "+Bal);
	}
	int search(int key)
	{
		int t=0;
		if(AC==key)
		{
			t=1;
		}
		else
		{
			t=0;
		}
		return t;
	}
	void Deposit()
	{
		Scanner S=new Scanner(System.in);
		System.out.println("how many amount wont to add:-");
		int depo=S.nextInt();
		Bal=Bal+depo;
		System.out.println("add successfully");
	}
	void withDawal()
	{
		Scanner S=new Scanner(System.in);
		System.out.println("how many amount wont to withDawal:-");
		int wdl=S.nextInt();
		if(Bal>wdl)
		{
			Bal=Bal-wdl;
			System.out.println("withDawal successfully");
		}
		else
		{
			System.out.println("not seficent balance to withDawal");
		}
	}
}
class bank
{
	public static void main(String[] args)
	{
		int b,a,n,i,key,opt;
		String na;
		char ch;
		Scanner S=new Scanner(System.in);
		System.out.println("how many record you enter");
		n=S.nextInt();
		details D[]=new details[n];	
		do
		{
			System.out.println("1.Add");
			System.out.println("2.show");
			System.out.println("3.search");
			System.out.println("4.deposite");
			System.out.println("5. cash widrol");
			System.out.println("enter the option");
			opt=S.nextInt();
			switch(opt)
			{
				case 1:

					for(i=0;i<n;i++)
					{
						D[i]=new details();
						System.out.println("enter the name:- ");
						na=S.next();
						System.out.println("enter the acount Number:- ");
						a=S.nextInt();
						System.out.println("enter the balance:- ");
						b=S.nextInt();
						D[i].readInput(na,a,b);   //function with argument
					}
					break;
				case 2:
					for(i=0;i<n;i++)
					{
						D[i].showOutput();
					}
					break;
				case 3:
					System.out.println("enter the search acount Number:-");
					key=S.nextInt();
					for(i=0;i<n;i++)
					{
						if(D[i].search(key)==1)
						{
							D[i].showOutput();
							break;
						}
					}
					if(i==n)
					{
						System.out.println("record not found");
					}
					break;
				case 4:
					System.out.println("enter the deposit Acount Number:-");
					key=S.nextInt();
					for(i=0;i<n;i++)
					{
						if(D[i].search(key)==1)
						{
							D[i].Deposit();
							break;
						}
					}
					if(i==n)
					{
						System.out.println("record not found");
					}
					break;
				case 5:
					System.out.println("enter the withDawal Acount Number:-");
					key=S.nextInt();
					for(i=0;i<n;i++)
					{
						if(D[i].search(key)==1)
						{
							D[i].withDawal();
							break;
						}
					}
					if(i==n)
					{
						System.out.println("record not found");
					}
					break;
				default:
					System.out.println("worng option");
					break;				
			}
			System.out.println("do you wont to continue Y/y");
			ch=S.next().charAt(0);
		}while(ch=='y');
	}
}