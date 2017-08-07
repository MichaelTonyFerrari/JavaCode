/**
 Determine if a string has all unique characters
 */
public class U1 {

    static boolean UnChar(String str){

        // Not in possible characters via ASCII
        if(str.length() > 128)
            return false;

        boolean[] charset = new boolean[128];

        for(int i=0; i < str.length(); i++)
        {
            // For each location in charset, check if we already seen. If true, we have seen.
            int val = str.charAt(i);
            if(charset[val])
                return false;

            // Set value to true
            charset[val] = true;
        }
        return true;
    }
    public static void main(String[] args){

        String one = "hello";
        String two = "cat";

        System.out.println(UnChar(one));
        System.out.println(UnChar(two));
    }
}
