package ArrayListExs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistCreatingWays {

	public static void main(String[] args) {
ArrayList<String> a=new ArrayList<String>();
a.add("mani");
a.add("naga");
a.add("sakhi");
a.add("harshi");
 
for(String s:a){
	System.out.println("advanced For Loop:"+s);
	}
System.out.println("------\t---*******---\t--------");
for(int i=0;i<a.size();i++) {
	System.out.println("forloop"+a);
}
System.out.println("------\t---*******---\t--------");
int i=0;
while(i<a.size()) {
System.out.println("while loop"+a);
i++;
}
System.out.println("------\t---*******---\t--------");
Iterator<String> it=a.iterator();
while(it.hasNext())
{
	System.out.println("iterator:"+it.next());
}
	}

}
