package InvalidNumber;

import java.util.Scanner;

public class EnterNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number between 1 to 10");
		try
		{
			int n=sc.nextInt();
			if(n<1 || n>10)
			{
				throw new InvalidNumberExc();//cal default constr
			}
			else
			{
				System.out.println("your enter valid number");

			}
		}
		catch(InvalidNumberExc e)
		{
			System.out.println("invalid Number"+e.getMessage());

		}
		//System.out.println("your enter valid number");
	}

}
