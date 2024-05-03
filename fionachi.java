import java.util.*;
class fionachi
{
	public static void main(String[] args) 
	{
		Scanner S=new Scanner(System.in);
		int a=0,b=1,c,i,n;
		System.out.println("enter the no.:- ");
		n=S.nextInt();
		System.out.print(a+" "+b);
		for(i=3;i<=n;i++)
		{
			c=a+b;
			System.out.print(" "+c+" ");
			a=b;
			b=c;
		}
	}
}