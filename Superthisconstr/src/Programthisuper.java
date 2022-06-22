//package Group1;

import java.util.Scanner;

class Person
{
	int id;  String name;
	Person(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("person constructor is excuted");

	    
	}
}

class Employee extends Person
{
	float sal;
	Employee(int id, String name, float sal) {

		super(id, name);
		this.sal=sal;
		System.out.println("employee constr excuted");

	}
	void dispaly()

	{
		System.out.println(id+" "+name+" "+sal);
	 try (Scanner sc = new Scanner(System.in)) {
		System.out.println(" employeee details are:");
		System.out.println("enter employe id name sal:");
		
		 id=sc.nextInt();
		 name=sc.next();
	     sal=sc.nextFloat();
	}
		System.out.println("employee id :"+id);
		System.out.println("employee name is:"+name);
	    System.out.println("employee sal:"+sal);
        System.out.println("Using scanner method employee detais are :"+id+" "+name+" "+sal);


	}

}

public class Programthisuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee(11,"mani",30000);
		System.out.println("Using constructr Emp details are:");
		e.dispaly();
	}

}