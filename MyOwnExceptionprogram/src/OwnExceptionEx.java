
public class OwnExceptionEx {

	public static void main(String[] args) {

		int i=8;
		int j=9;//j=0 it will throw Airmtc excptn
		try {
			int k=i/j;
			if(k==0) throw new MyOwnException("division is not possible");
			System.out.println(k);
		}
		catch(MyOwnException e)
		{
			System.out.println("error occured:"+e.getMessage());
		}


	}

}
