package Practice;

import java.util.Scanner;

public class SUmAndCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int sum=0,count=0;
		int even = 0,odd=0;

		while(num>0) {
			sum=sum+num%10;//find sum
			
			if(num%2==0) {
				even++;//find even
			}else {
				odd++;//find odd
			}
			num=num/10;
			count++;//find count

		}
		System.out.println("sum of numbers :"+sum);
		System.out.println("count of numebrs :"+count);
		System.out.println("even numbers are:"+even);
		System.out.println("odd numbers are:"+odd);
		
		
	}

}
