//LC #70
public class ClimbingStairs
{
    public static int climbStairs(int n)
    {
        int a = 1, b = 1, c = 0;
        for(int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
