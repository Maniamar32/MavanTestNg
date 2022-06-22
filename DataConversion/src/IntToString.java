
public class IntToString {

	public static void main(String[] args) {
    int i=200;
    String s=String.valueOf(i);
    String s1=Integer.toString(i);
    String s2=String.format("%d", i);
    System.out.println(s);//200
    System.out.println(s1);//200
    System.out.println(s+i);//200200
    System.out.println(s1+i);//200200
    System.out.println(s2);//200
	}

}
