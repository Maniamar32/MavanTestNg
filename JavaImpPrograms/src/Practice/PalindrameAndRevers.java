package Practice;

import java.util.Scanner;

public class PalindrameAndRevers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int num1=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println("reverce number is:"+rev);
		if(rev==num1) {
			System.out.println("palindrame");
		}else {
			System.out.println("not palindrame");
		}
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer sb1=sb.reverse();
		if(sb1.equals(sb1)) {
			System.out.println("String buffer palindrame");
			}else {
				System.out.println(" not palindrame");
				
			}
		
		
		StringBuilder sb2=new StringBuilder();
	  sb2.append(num);
	  StringBuilder sb3=sb2.reverse();
	  if(sb3.equals(sb2)) {
			System.out.println("String builder palindrame");
			}else {
				System.out.println(" not palindrame");
				
			}
		
	  

	}

}
