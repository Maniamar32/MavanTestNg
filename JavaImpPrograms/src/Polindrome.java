
public class Polindrome {

	public static void main(String[] args) {
int num=16461;
int num1=num;
int rev=0;
while(num>0) {
	rev=rev*10+num%10;
	num=num/10;
	
}
if(num1==rev) {
	System.out.println("palindrome");
	
}else {
	System.out.println(" not palindrome");

}
	}

}
