import java.util.Arrays;

/**
 Given two strings, decide if one is a permutation of the other
 Solved via sorting
 */
public class CP {

    static String sort(String x){

        // Convert to char array
        char[] content = x.toCharArray();
        // Sort
        Arrays.sort(content);
        // Back to string
        return new String(content);
    }
    static boolean perm(String one, String two){

        // First compare lengths
        if(one.length() != two.length())
            return false;

        return sort(one).equals(sort(two));
    }
    public static void main(String[] args){
        String one = "Kittens";
        String two = "Kittens";
        String three = "Kit";
        String four = "Dogs";
        String five = "snettiK";

        boolean v = perm(one, five);
        boolean x = perm(one, two);
        boolean y = perm(one, three);
        boolean z = perm(one, four);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(v);
    }
}
