import java.util.*;
class matrix
{
	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		int i,j,row,col,s=0,d1=0,d2=0;
		System.out.println("how many rows you enter:- ");
		row=S.nextInt();
		System.out.println("how many coloumns you enter:- ");
		col=S.nextInt();
		int a[][]=new int[row][col];
		System.out.println("enter the "+row*col+" elements:- ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=S.nextInt();	
			}

		}
		System.out.println("your matrix is this:-");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
				s=s+a[i][j];
				if(i==j)
				{
					d1=d1+a[i][j];
				}
				if((i+j)==2)
				{
					d2=d2+a[i][j];
				}
			}
			System.out.print("sum is:- "+s);
			s=0;
			System.out.println(" ");
		}
		System.out.println("digonal 1 sum is:- "+d1);
		System.out.println("digonal 2 sum is:- "+d2);
	}
}