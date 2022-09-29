package Practice;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int num=sc.nextInt();
int sum=0,rem=0;
int num1=num;
while(num!=0) {
	rem=num%10;
	sum=sum+(rem*rem*rem);
	num=num/10;
	
}
System.out.println(sum);
if(num1==sum) {
	System.out.println("amstrang");
}else {
	System.out.println(" not amstrang");
}

	}

}
