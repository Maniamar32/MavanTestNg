
public class ObjectToStringRev {

	public static void main(String[] args) {

		String s="niti";
		String rev1="";
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String rev=sb.toString();
		String rev2=String.valueOf(s);
		System.out.println("revence2 is:"+rev2);
		if(s.equals(rev))
		{
			System.out.println("palindrome");
			}
		else
		{
			System.out.println("not palindrome");

		}
		 System.out.println("--------prgm without stngbuilder---");
		 for(int i=s.length()-1;i>=0;i--)
		 {
			 System.out.println(i);//4
			 //n
			 //3
			 //ni
			 //2
			 //nit
			 //1
			 //niti
			 //0
			 //nitin

         rev1=rev1+s.charAt(i);
         
		System.out.println(rev1);//n
		//ni
		//nit
		//niti
		//nitin
		 }
		 if(s.equals(rev1))
		 {
			 System.out.println("palindrome");
		 }
		 else
		 {
			 System.out.println(" not palindrome");
		 }
	}

}
