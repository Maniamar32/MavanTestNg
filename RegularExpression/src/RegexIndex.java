import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter regex pattern");
		Pattern p=Pattern.compile(sc.nextLine());
		System.out.println("enter text");
		Matcher m=p.matcher(sc.nextLine());
		boolean f=false;
		while(m.find())
		{
			System.out.println("text index "+m.group()+"start index"+m.start()+"end index"+m.end());
			f=true;
		}
		if(!f)
		{
		    System.out.println("not match");

		}



	}

}
