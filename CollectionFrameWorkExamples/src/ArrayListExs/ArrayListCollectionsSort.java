package ArrayListExs;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollectionsSort {

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
			System.out.println("ascending order:"+s);
			}
		
		System.out.println("------\t---*******---\t--------");
		
		Collections.sort(a,Collections.reverseOrder());
		for(String s:a){
			System.out.println("reverseOrder:"+s);
			}
		System.out.println("------\t---*******---\t--------");
		Collections.swap(a, 0, 3);
		for(String s:a){
			System.out.println("swaping:"+s);
			}
		System.out.println("------\t---*******---\t--------");
		

	}

}
