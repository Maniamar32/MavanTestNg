package Practice;

import java.util.Scanner;

public class StringReversc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String s=sc.nextLine();
		String rev= "";
		for(int i=s.length()-1;i>=0;i--) 
			rev +=s.charAt(i);
		

		if(rev.equalsIgnoreCase(s)) {
			System.out.println("String polidrome done");

		}
		else {
			System.out.println("String not polidrome done");

		}

	}

}
