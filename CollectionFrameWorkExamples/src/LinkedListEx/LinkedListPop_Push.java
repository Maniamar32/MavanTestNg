package LinkedListEx;

import java.util.LinkedList;

public class LinkedListPop_Push {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("AA");
		l.add("BB");
		l.add("CC");
		l.add("DD");
		l.add("EE");
		for(String s:l) {
			System.out.println(s);
		}
	 
		System.out.println("retrived element is:"+l.pop());
		System.out.println("remaingLIst"+l);
		
		
      l.push("aaa");
      //for(String s:l) {
		System.out.println("after pop result is:"+l);
		//}
		

	}

}
