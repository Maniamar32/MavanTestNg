package ComparableCompareTo;

public class Student  implements Comparable{
public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
int rollno;
String name;
int age;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
}
//@Override
public int compareTo(Student cs) {
	int compareage=((Student)cs).getAge();
	return this.age-compareage;
}
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}


}
