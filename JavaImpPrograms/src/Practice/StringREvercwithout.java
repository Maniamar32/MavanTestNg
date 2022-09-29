package Practice;

import java.util.Scanner;

public class StringREvercwithout {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
        String s=sc.nextLine();
        String rev="";
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        
        StringBuilder sb1=sb.reverse();
        rev=sb1.toString();
        if(rev.equalsIgnoreCase(s)) {
        	System.out.println("palindrome");
        	}else {
        		System.out.println("not palindrome");

        	}
        
        
        
        
        /*StringBuffer sb=new StringBuffer(s);
        StringBuffer sb1=sb.reverse();
        System.out.println(sb1);
        rev=sb1.toString();
        if(rev.equalsIgnoreCase(s)) {
        	System.out.println("palindrome");

        }else {
        	System.out.println(" not palindrome");

        }*/
        	
        
        
		/*String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev +=s.charAt(i);

		}
		if(rev.equalsIgnoreCase(s)) {
			System.out.println("palindrome");

		}else {
			System.out.println("not palindrome");

		}*/


	}

}
