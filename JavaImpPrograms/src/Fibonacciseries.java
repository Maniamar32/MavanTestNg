
public class Fibonacciseries {

	public static void main(String[] args) {
int n1=0,n2=1;
System.out.println(n1+"\n"+n2);
for(int i=0;i<=5;i++) {
	int n3=n1+n2;
	n1=n2;
	n2=n3;
	System.out.println(n3);
	
}

	}

}
