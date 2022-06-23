package ArrayListExs;

import java.util.ArrayList;

public class ArraylistContains {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("mani");
		a.add("naga");
		a.add("sakhi");
		a.add("harshi");
		ArrayList<String> b=new ArrayList<String>();
		b.add("amar");
		b.add("nari");
		b.add("raj");
		b.add("harshi");
		for(String s:b) {
		System.out.println(s);
		}
       //System.out.println( a.contains(b));
		ArrayList<String> c=new ArrayList<String>();
		for(String s:b)
		c.add(a.contains(s)? "Y":"N");
	System.out.println(c);
		
	}

}
