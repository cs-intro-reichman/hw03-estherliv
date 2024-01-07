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
    public static String uniqueChars(String str) {
        String unique = "";
        boolean duplicate;
        char temp;
        int index;

        for(int i = 0; i < str.length(); i++){
            duplicate = false;

            if(str.charAt(i) != ' ') {
                index = str.indexOf(str.charAt(i));
                temp = str.charAt(index);

                if ( (str.charAt(i) == temp) && (i != index) )
                   duplicate = true;
            }

            if(!duplicate)
                 unique += str.charAt(i);
        }

        return unique;
    }
}
