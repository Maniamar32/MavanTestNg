
public class PalindromwithStringBUILDERBuffer {

	public static void main(String[] args) {
int num=16461;
StringBuilder sb=new StringBuilder();
sb.append(num);
StringBuilder sb1=sb.reverse();
if(sb1==sb) {
	System.out.println("palindrome");

}else
System.out.println("not palindrome");


//***********************************************
StringBuffer sbb=new StringBuffer(String.valueOf(num));
StringBuffer sbb1=sbb.reverse();
if(sbb==sbb1) {
	System.out.println("palindrome");
	}else
	{
		System.out.println("not palindrome");
	}
	}

}
