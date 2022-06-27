package ComparableCompareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {

	public static void main(String[] args) {
ArrayList<Student> a=new ArrayList<Student>();
a.add(new Student(121,"mani",32));
a.add(new Student(122,"amar",37));
a.add(new Student(780,"harshi",34));
a.add(new Student(958,"sakhi",33));
Collections.sort( a);
for(Student s:a)
{
	System.out.println(s);
	
}
	}

}
