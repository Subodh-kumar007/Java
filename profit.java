import java.util.*;
class NetPrice
{
	public static void main(String []agr)
	{
		int cost,selling,result;
		Scanner S=new Scanner(System.in);
		System.out.print("enter the cost price:- ");
		cost=S.nextInt();
		System.out.print("enter the selling price:- ");
		selling=S.nextInt();
		result=selling-cost;
		String f=(selling>cost)?"profit:- "+result:"loss:- "+result;
		System.out.println(f);
	}

}