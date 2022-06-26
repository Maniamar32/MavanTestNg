class Aa
{
	public int add(int i,int j)
	{
		return (i+j);

	}
}
class B extends Aa
{
	public int sub(int i,int j)	
	{
		return (i-j);

	}

}
public class Overriding {
      public static void main(String[] args) {
		B b=new B();
		int sum =b.add(1, 2);
		int sub=b.sub(4, 2);
		System.out.println("sum is  :"+sum);
		System.out.println("sub is    :"+sub);

	}

}
