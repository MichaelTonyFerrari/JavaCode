/**
 * Created by Michael Ferraro on 8/7/2017.
 */
public class Ts{

    static int countways(int n){

        if(n<0)
            return 0;
        else if(n==0)
            return 1;
        else
            return countways(n-1) + countways(n-2) + countways(n-3 );
    }

    public static void main(String[] args){

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;

        System.out.println(countways(a));
        System.out.println(countways(b));
        System.out.println(countways(c));
        System.out.println(countways(d));
        System.out.println(countways(e));
        System.out.println(countways(f));

    }
}
