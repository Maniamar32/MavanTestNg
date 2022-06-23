package ArrayListExs;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithSublist {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("mani");
		a.add("naga");
		a.add("sakhi");
		a.add("harshi");
		System.out.println(a);

		ArrayList<String> b=new ArrayList(a.subList(0, 2));
		System.out.println(b);
		System.out.println("--------\t ---****--- \t   -------");
		
		List<String> l=a.subList(1, 3);
		System.out.println(l);


		
		
	}

}
