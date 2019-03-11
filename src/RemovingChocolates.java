import java.util.*;

//Return # of combinations where 1 and 3 sum to target value n modulo (10^9 + 7)
public class RemovingChocolates
{
    public static int numberOfWaysRec(int n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else if(n < 0)
        {
            return 0;
        }
        return (numberOfWaysRec(n - 1) + numberOfWaysRec(n - 3)) % ((int)Math.pow(10, 9) + 7);
    }

    public static int numberOfWaysMemo(int n, Map<Integer, Integer> m)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else if(n < 0)
        {
            return 0;
        }
        else if(m.containsKey(n))
        {
            return m.get(n);
        }
        int sum = (numberOfWaysMemo(n - 1, m) + numberOfWaysMemo(n - 3, m)) % ((int)Math.pow(10, 9) + 7);
        if(!m.containsKey(sum))
        {
            m.put(n, sum);
        }
        return sum;
    }

    public static int numberOfWaysBottomUp(int n)
    {
        int a = 1;
        int b = 1;
        int c = 1;
        int d;
        for(int i = 3; i <= n; i++)
        {
            d = (a + c) % ((int)Math.pow(10, 9) + 7);
            a = b % ((int)Math.pow(10, 9) + 7);
            b = c % ((int)Math.pow(10, 9) + 7);
            c = d;
        }
        return c;
    }
}
