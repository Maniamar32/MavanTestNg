import java.util.Scanner;

public class Dateprogram {

	public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		System.out.println("github");


		int y = sc.nextInt();
		if((y%4==0)&&(y%100 !=0)||(y%400==0))
		{
		System.out.println("leap year");
		}
		else 
		{
			System.out.println("not leap year");

		}
	}

}
