/**
 Determine if a string has all unique characters
 */
public class U2 {

    /**
     Reducing space by factor of 8 using bit vector.
     Assuming lowercase letters only, use single int.
     */
    static boolean UnChar(String str){

        int checker = 0;

        for(int i=0; i < str.length(); i++){
            int val = str.charAt(i) - 'a';

            if((checker & (1 << val)) > 0)
                return false;

            checker |= (1 << val);
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
