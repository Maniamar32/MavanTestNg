package Practice;

import java.util.Scanner;

public class StringReversc {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   System.out.println("enter String");
    String s=sc.next();
    String s1=s;
    String rev=" ";
    for(int i=s.length()-1;i>=0;i--) {
    	rev=rev+s.charAt(i);
    	
    }
    System.out.println(rev);
    if(s1.equals(rev)) {
        System.out.println("String polidrome done");

    }
    else {
    	 System.out.println("String not polidrome done");
    }
	}

}
