import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToString {

	public static void main(String[] args) {
  Date d=Calendar.getInstance().getTime();
  System.out.println(d);//Sun Mar 20 16:57:06 IST 2022
 DateFormat df=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
  System.out.println(df);// java.text.SimpleDateFormat@b9b195a0
  String s=df.format(d);
  System.out.println(s);//20-03-2022 04:57:06
  
	}

}
