import java.util.*;
class triangle
{
	public static void main(String...arg)
	{
		int a,b,c,sum;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the side 1:- ");
		a=S.nextInt();
		System.out.println("Enter the side 2:- ");
		b=S.nextInt();
		System.out.println("Enter the side 3:- ");
		c=S.nextInt();
		sum=a+b+c;
		if(sum==180)
		{
			System.out.println("triangle is valid");
		}
		else
		{
			System.out.println("triangle is not valid");
		}
	}
}