/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        if (s.length() < 1){
            return -1;
        }

        String str = "";
        for (int i = 0; i < s.length; i++) {
            char curr = s.charAt(i);
            if (curr >= 'A' && curr <= 'Z') {
                curr = (char) (curr + 32);
        }
        str = str + curr;
    }
    return str;
}
}