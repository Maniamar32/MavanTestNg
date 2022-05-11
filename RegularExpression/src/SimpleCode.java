import java.util.regex.Pattern;

public class SimpleCode {

	public static void main(String[] args) {
        // System.out.println(Pattern.matches("[amen]?", "n"));//a or m or e or n comes only one
          //System.out.println(Pattern.matches("[amen]+", "nnnmmaa"));//a or m or e or n comes  more times
         // System.out.println(Pattern.matches("[abced]*", "aabbcceeeeee"));//a or m or e or n comes zero
         // System.out.println(Pattern.matches("\\d", "1"));//accept one number
        //  System.out.println(Pattern.matches("\\D", "a")); //accpet one letter
         // System.out.println(Pattern.matches("\\D*", "its accept complt sentance")); //accpet one letter
           // System.out.println(Pattern.matches("..s", "sss")); //accpet 3 letters,s must in third place,also it will accept frst n second place as ss,ex:mas ass tss abs 
           // System.out.println(Pattern.matches(".s", "ts")); //accpet 2 letters,s must in third place,also it will accept frst n second place as ss 
    //    System.out.println(Pattern.matches("[a-zA-Z0-9]{5}", "h5hA4")); //accpet 5 anthing from azAZ09 in any place
      //  System.out.println(Pattern.matches("[243]{1}[0-9]{4}", "22235")); //accpet 5 anthing from azAZ09 in any place
       // System.out.println(Pattern.matches("[243][0-9]{4}", "32235")); //accpet 5 anthing from azAZ09 in any place



	}

}
