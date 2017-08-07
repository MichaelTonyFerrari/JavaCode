import java.util.Arrays;

/**
 * Created by Michael Ferraro on 8/7/2017.
 */
public class Ts2 {

    static int countways(int n){

        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        return countways(n, memo);
    }

    static int countways(int n, int[] memo){

        if(n<0)
            return 0;
        else if(n==0)
            return 1;
        else if(memo[n] > -1)
            return memo[n];
        else
            memo[n] =   countways(n-1, memo) +
                        countways(n-2, memo) +
                        countways(n-3, memo);
        return memo[n];
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
