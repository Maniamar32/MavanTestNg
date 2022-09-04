
public class CountNumbers {

	public static void main(String[] args) {
		System.out.println("hiii");
		int num=12345;
		int count=0;
		while(num>0) {
            num=num/10;
            count++;
		}
		System.out.println("number count is:"+count);
	}

}
