import java.util.*;

public class Fibonacci
{
    public static long fibRec(long n)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        return fibRec(n - 1) + fibRec(n - 2);
    }

    public static long fibMemo(long n, Map<Long, Long> m)
    {
        if(n == 0 || n == 1)
        {
            return 1;
        }
        else if(m.containsKey(n))
        {
            return m.get(n);
        }
        long sum = fibMemo(n - 1, m) + fibMemo(n - 2, m);
        if(!m.containsKey(n))
        {
            m.put(n, sum);
        }
        return sum;
    }

    public static long fibBottomUp(long n)
    {
        long a = 1;
        long b = 1;
        long c;
        for(int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
