package LinkedListEx;

import java.util.LinkedList;

public class LinkedListPeek {

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
	 
		System.out.println("retrived element is:"+l.peek());
		System.out.println("remaingLIst"+l);
		
		System.out.println("retrived element is:"+l.peekFirst());
		System.out.println("remaingLIst"+l);
		
		System.out.println("retrived element is:"+l.peekLast());
		System.out.println("remaingLIst"+l);
	
	
	
	}

}
