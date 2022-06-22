class A
{
	public int add(int i,int j)
	{
		return (i+j);
	}
	public int add(int i,int j,int k)
	{
		return (i+j+k);
	}
}
public class OverloadindingEx {

	public static void main(String[] args) {
          A a=new A();
         System.out.println( a.add(1,2 , 3));
         System.out.println( a.add(3, 4));
	}

}
