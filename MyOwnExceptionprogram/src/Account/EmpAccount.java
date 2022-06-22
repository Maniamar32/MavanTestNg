package Account;

import java.util.Scanner;

public class EmpAccount {
	public static void withdraw(int amount) throws InsufficientBalExp
	{
		if(amount>2000)
		{
			throw new InsufficientBalExp("you dont have sufficient bal");
		}
		else
		{
			System.out.println("please withdraw amount");
		}

	}


	public static void main(String[] args) {

		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter amount");
			int amount=sc.nextInt();
			withdraw(amount);
		}
		catch(InsufficientBalExp e)
		{
			System.out.println("InsufficientBalExp:"+e.getMessage());
		}
		System.out.println("Thank you for visiting");
	}

}
