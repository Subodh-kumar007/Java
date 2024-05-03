import java.util.*;
class Age
{
	public static void main(String...arg)
	{
		int a,b,c;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the Ram age:- ");
		a=S.nextInt();
		System.out.println("Enter the Shyam age:- ");
		b=S.nextInt();
		System.out.println("Enter the Ajay age:- ");
		c=S.nextInt();
		if(a<b && a<c)
		{
			System.out.println("Ram is youngest");
		}
		else if(b<a && b<c)
			{
				System.out.println("Shyam is youngest");
			}
			else
			{
				System.out.println("Ajay is youngest");
			}
	}
}