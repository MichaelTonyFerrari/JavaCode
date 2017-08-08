/**
 Given two strings, decide if one is a permutation of the other
 Solved checking identical character counts
 */

public class CP2 {

    static boolean perm(String one, String two){

        if(one.length() != two.length())
            return false;

        // Assuming ASCII
        int[] letters = new int[128];

        // Fill array to act like hash table
        for(int i = 0; i < one.length(); i++){
            letters[one.charAt(i)]++;
        }

        for(int j = 0; j < two.length(); j++){
            letters[two.charAt(j)]--;

            if(letters[two.charAt(j)] < 0)
                return false;
        }
        return true;
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
