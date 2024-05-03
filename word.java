import java.util.*;
class word
{
	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		int n,e,c=0;
		System.out.println("Enter the Number:- ");
		n=S.nextInt();
		while(n!=0)
		{
			e=n%10;
			n=n/10;
			c=c*10+e;
		}
		while(c!=0)
		{
			e=c%10;
			c=c/10;
			switch(e)
			{
				case 1:
					System.out.print("One ");
					break;
				case 2:
					System.out.print("Two ");
					break;
				case 3:
					System.out.print("Three ");
					break;
				case 4:
					System.out.print("Four ");
					break;
				case 5:
					System.out.print("Five ");
					break;
				case 6:
					System.out.print("Six ");
					break;
				case 7:
					System.out.print("Seven ");
					break;
				case 8:
					System.out.print("Eight ");
					break;
				case 9:
					System.out.print("Nine ");
					break;
				default:
					System.out.print("Zero");		
			}
		}
	}
}