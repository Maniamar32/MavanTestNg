
public class LongToString {

	public static void main(String[] args) {
long l=9700L;
String s=String.valueOf(l);
String s1=Long.toString(l);
System.out.println(s1);//9700
System.out.println(s+l);//97009700
System.out.println(l+l);//19400

	}

}
