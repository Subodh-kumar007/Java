import java.util.*;
class find
{
	public static void main(String arg[])
	{
		Scanner S=new Scanner(System.in);
		int n;
		System.out.println("enter the no.");
		n=S.nextInt();
		if(n%2==0)
		{
			System.out.println(n+" is even");
		}
		else
		{
			System.out.println(n+" is odd");
		}
	}
}