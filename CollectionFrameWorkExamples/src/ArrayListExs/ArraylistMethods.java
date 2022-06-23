package ArrayListExs;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistMethods {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("mani");
		a.add("naga");
		a.add("sakhi");
		a.add("harshi");
		
		System.out.println(a);
		System.out.println("------\t---*******---\t--------");
		
		Collections.sort(a);
		 
		for(String s:a){
			System.out.println("advanced For Loop:"+s);
			}
		
		System.out.println("------\t---*******---\t--------");
		
		Collections.sort(a,Collections.reverseOrder());
		for(String s:a){
			System.out.println("advanced For Loop:"+s);
			}
		System.out.println("------\t---*******---\t--------");

		a.add(2, "amar");
		System.out.println(a);
		System.out.println("------\t---*******---\t--------");
		ArrayList<String> b=new ArrayList<String>();
		b.add("mani");
		b.add("naga");
		b.add("sakhi");
		b.add("harshi");
		b.addAll(a);
		System.out.println(b);
		System.out.println("------\t---*******---\t--------");
		
		
	}

}
