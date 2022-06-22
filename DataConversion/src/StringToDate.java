import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) {
   String s="18/04/2020";
  // Date d=new SimpleDateFormat("dd/mm//yyyy").parse(s);
   //System.out.println(s+"\t"+d);
   SimpleDateFormat f=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
  // Date d=f.parse(s);
   //System.out.println(s+"\t"+d);

	}

}
