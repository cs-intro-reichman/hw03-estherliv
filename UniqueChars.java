/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        if(s.length()<1){
            return "";
        }

        String str = "";

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (curr != ' ' && str.indexOf(curr) == -1) {
                str = str + curr;
        }
        
    }
    return str;
    }
}
